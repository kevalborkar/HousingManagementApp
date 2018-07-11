package com.kevalborker.residency.app.dto.updateCars;

import java.io.Serializable;

public class UpdateCarDTO implements Serializable{

	private String contactNo ;
	private int newCarNum ;
	
	public UpdateCarDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
		
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getNewCarNum() {
		return newCarNum;
	}

	public void setNewCarNum(int newCarNum) {
		this.newCarNum = newCarNum;
	}
	
	
}
