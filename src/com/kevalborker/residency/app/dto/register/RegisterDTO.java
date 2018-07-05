package com.kevalborker.residency.app.dto.register;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user_table")
public class RegisterDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="myId",strategy="increment")
	@GeneratedValue(generator="myId")
	@Column(name="id")
	private int id;
	
	@Column(name="uniqueId")
	private String uniqueId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="buildingNum")
	private int buildingNum;
	
	@Column(name="floorNum")
	private int floorNum;
	
	@Column(name="houseName")
	private int houseName;
	
	@Column(name="contactNo")
	private BigInteger contactNo;
	
	@Column(name="numOfCars")
	private int numOfCars;

	public RegisterDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object Created !!");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBuildingNum() {
		return buildingNum;
	}

	public void setBuildingNum(int buildingNum) {
		this.buildingNum = buildingNum;
	}

	public int getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

	public int getHouseName() {
		return houseName;
	}

	public void setHouseName(int houseName) {
		this.houseName = houseName;
	}

	public BigInteger getContactNo() {
		return contactNo;
	}

	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}

	public int getNumOfCars() {
		return numOfCars;
	}

	public void setNumOfCars(int numOfCars) {
		this.numOfCars = numOfCars;
	}

	@Override
	public String toString() {
		return "RegisterDTO [id=" + id + ", uniqueId=" + uniqueId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", age=" + age + ", buildingNum=" + buildingNum + ", floorNum="
				+ floorNum + ", houseName=" + houseName + ", contactNo=" + contactNo + ", numOfCars=" + numOfCars + "]";
	}
	
	
	
	
	
	
}
