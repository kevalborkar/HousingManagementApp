package com.kevalborker.residency.app.controller.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kevalborker.residency.app.dto.register.RegisterDTO;
import com.kevalborker.residency.app.service.register.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {

	
	public RegisterController() {
		System.out.println(this.getClass().getSimpleName()+ " Object Created !!");
	}
	
	@Autowired
	RegisterService regServ;
	
	@RequestMapping(value="register.do" , method=RequestMethod.POST)
	public String registerController(RegisterDTO dtofromuser) {
		
		System.out.println("registerController in registerController started");
		
		regServ.registerService(dtofromuser);
		
		System.out.println("registerController in registerController ended");
		
		return "/Success.jsp";
	}
}
