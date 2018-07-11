package com.kevalborker.residency.app.controller.updateCars;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kevalborker.residency.app.dto.register.RegisterDTO;
import com.kevalborker.residency.app.dto.updateCars.UpdateCarDTO;
import com.kevalborker.residency.app.service.updateCars.UpdateCarService;

@Controller
public class CarUpdateController {
	
	public CarUpdateController() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Autowired
	UpdateCarService updetser;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView fetchDetails(RegisterDTO dtofromsession,HttpServletRequest req) {
		
		HttpSession httpSession = req.getSession(false);
	
		
		if(httpSession != null) {
			
			// httpSession.setAttribute("contactNo", dtofromsession.getContactNo());
			 String contactNo = (String)httpSession.getAttribute("contactNo");
			 int newCarNum = (int)httpSession.getAttribute("numOfCars");
			 //httpSession.setAttribute("numOfCars", dtofromsession.getNumOfCars());
			 httpSession.setAttribute("UsrName", dtofromsession.getFirstName());
			 ModelMap model = new ModelMap();
			 model.put("contactNo",contactNo);
			 model.put("newCarNum", newCarNum);
			 
				
			return new ModelAndView("Updatedetails.jsp",  model);
		}
		
		return new ModelAndView("Login.jsp" ,"msg","Invalid Session, Login to continue!!");
		 
	}
	
	@RequestMapping(value="updatedetails.do" , method=RequestMethod.POST)
	public ModelAndView updateDetailsController( UpdateCarDTO dtofromUser , HttpServletRequest req) {
		System.out.println("updateDetails() in UpdateCarDAO started");
		
		HttpSession httpSession = req.getSession(false);
		
		if(httpSession != null) {
			
			int affectedrow = updetser.updateDetailsService(dtofromUser);
			
			if(affectedrow == 1 ) {
				
				System.out.println("updateDetailsController() in CarUpdateController ended");
				
				return new  ModelAndView("/Welcome.jsp", "msg2", "Your details are updated successfully");
				
			}
			else {
				
				System.out.println("updateDetailsController() in CarUpdateController ended");
				
				return new  ModelAndView("/Updatedetails.jsp", "msg", "Something went wrong");
			}
			
		}
		else {
			
			System.out.println("updateDetailsController() in CarUpdateController ended");
			
			return new  ModelAndView("/Login.jsp", "msg", "Invalid Seesion,Login to continue!");
			
		}

	}
}
