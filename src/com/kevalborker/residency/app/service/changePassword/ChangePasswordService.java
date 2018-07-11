package com.kevalborker.residency.app.service.changePassword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevalborker.residency.app.dao.changePassword.ChangePasswordDAO;
import com.kevalborker.residency.app.dto.changePassword.ChangePasswordDTO;


@Service
public class ChangePasswordService {

	public ChangePasswordService() {
		System.out.println(this.getClass().getSimpleName()+" Object created");
	}
	
	@Autowired
	ChangePasswordDAO chgPass;
	
	public int changePasswordService(ChangePasswordDTO dtofromCPCtrl) {
		System.out.println("changePasswordService() in ChangePasswordService started");
		
		int resultFromDAO = chgPass.changePassword(dtofromCPCtrl);
		
		System.out.println("changePasswordService() in ChangePasswordService ended");
		
		return resultFromDAO;
	}
}
