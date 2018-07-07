package com.kevalborker.residency.app.dto.changePassword;

import java.io.Serializable;

public class ChangePasswordDTO implements Serializable{
	
	
	private String contactNo;
	private String newuniqueId;
	
	public ChangePasswordDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object created");
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getNewuniqueId() {
		return newuniqueId;
	}

	public void setNewuniqueId(String newuniqueId) {
		this.newuniqueId = newuniqueId;
	}

	
	
}
