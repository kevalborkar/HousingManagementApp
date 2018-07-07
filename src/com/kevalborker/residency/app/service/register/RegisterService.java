package com.kevalborker.residency.app.service.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevalborker.residency.app.dao.register.RegisterDAO;
import com.kevalborker.residency.app.dto.register.RegisterDTO;

@Service
public class RegisterService {
	
	
	public RegisterService() {
		System.out.println(this.getClass().getSimpleName()+ " Oblect created !!");
	}
	
	@Autowired
	RegisterDAO regDAO;
	
	public void registerService(RegisterDTO dtofromRctrl ) {
		System.out.println("registerService in registerService started");
		
		regDAO.saveUser(dtofromRctrl);
		
		System.out.println("registerService in registerService ended");
	}
}
