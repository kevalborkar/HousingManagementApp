package com.kevalborker.residency.app.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevalborker.residency.app.dao.login.LoginDAO;
import com.kevalborker.residency.app.dto.login.LoginDTO;
import com.kevalborker.residency.app.dto.register.RegisterDTO;

@Service
public class LoginService {
	
	public LoginService() {
		System.out.println(this.getClass().getSimpleName()+ " object created");
	}
	
	@Autowired
	LoginDAO logDao;
	
	public RegisterDTO userLoginService(LoginDTO dtofromLCtrl) {
		System.out.println("userLoginService in LoginService started");
		
		RegisterDTO dtofromdao = logDao.checkUserInDb(dtofromLCtrl);
		
		System.out.println("userLoginService in LoginService ended");
		
		return dtofromdao;
	}
}
