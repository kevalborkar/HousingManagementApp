package com.kevalborker.residency.app.service.updateCars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevalborker.residency.app.dao.updateCars.UpdateCarDAO;
import com.kevalborker.residency.app.dto.updateCars.UpdateCarDTO;

@Service
public class UpdateCarService {
	
	public UpdateCarService() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Autowired
	UpdateCarDAO upDetdao;
	
	public int updateDetailsService(UpdateCarDTO dtofromCtrl) {
		
		System.out.println("updateDetails() in UpdateCarDAO started");
		
		int affectedrow = upDetdao.updateDetailsDAO(dtofromCtrl);
		
		System.out.println("updateDetails() in UpdateCarDAO ended");
		return affectedrow;
	}
}
