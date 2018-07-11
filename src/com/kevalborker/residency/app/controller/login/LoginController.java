package com.kevalborker.residency.app.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kevalborker.residency.app.dto.login.LoginDTO;
import com.kevalborker.residency.app.dto.register.RegisterDTO;
import com.kevalborker.residency.app.service.login.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	public LoginController() {
		System.out.println(this.getClass().getSimpleName()+ " object created");
	}
	
	@Autowired
	LoginService LogSer;
	
	@RequestMapping(value="login.do" ,  method=RequestMethod.POST)
	public ModelAndView userLoginController(LoginDTO dtofromuser , HttpServletRequest req ) {
		System.out.println("userLoginController in LoginController started");
		
		RegisterDTO dtofromservce = LogSer.userLoginService(dtofromuser);
		
		if(dtofromservce != null) {
			
			HttpSession	HttpSession = req.getSession(true);
			HttpSession.setAttribute("UsrReg", dtofromservce);
			HttpSession.setAttribute("contactNo", dtofromservce.getContactNo());
			HttpSession.setAttribute("numOfCars", dtofromservce.getNumOfCars());

			System.out.println("userLoginController in LoginController ended");
			
			return new ModelAndView("/Welcome.jsp", "UsrName", dtofromservce.getFirstName()) ;
		}else {
			
			System.out.println("userLoginController in LoginController ended");
			
			return new ModelAndView("/Login.jsp", "msg", "Invalid User !! Please Try Again");
			
		}
	}
}
