package com.kevalborker.residency.app.dto.login;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginDTO implements Serializable{

	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object created ");
	}
	
	private String uniqueId;
	private String contactNo;
	
	
	public String getuniqueId() {
		return uniqueId;
	}
	public void setuniqueId(String uId) {
		this.uniqueId = uId;
	}
	public String getcontactNo() {
		return contactNo;
	}
	public void setcontactNo(String cNo) {
		this.contactNo = cNo;
	}
	
	
	
}
