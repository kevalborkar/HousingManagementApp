package com.kevalborker.residency.app.controller.changePassword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kevalborker.residency.app.dto.changePassword.ChangePasswordDTO;
import com.kevalborker.residency.app.service.changePassword.ChangePasswordService;

@Controller
@RequestMapping("/")
public class PasswordController {

	public PasswordController() {
		System.out.println(this.getClass().getSimpleName()+" Object created");
	}
	
	@Autowired
	ChangePasswordService chgPassSer;
	
	@RequestMapping(value="changepass.do", method=RequestMethod.POST )
	public ModelAndView changePasswordController(ChangePasswordDTO dtofromuser) {
		System.out.println("changePasswordController in PasswordController started");
		
		int resultFromSer = chgPassSer.changePasswordService(dtofromuser);
			
			if(resultFromSer == 1) {
				
				System.out.println("changePasswordController in PasswordController endted");
				return new ModelAndView("/Login.jsp", "msg", "Password Changed Successfully!!");
				
			}else {
				
				System.out.println("changePasswordController in PasswordController endted");
				return new  ModelAndView("/ChangePassword.jsp", "msg", "Provide Correct ContactNo");
			}
		
	}
	
}
