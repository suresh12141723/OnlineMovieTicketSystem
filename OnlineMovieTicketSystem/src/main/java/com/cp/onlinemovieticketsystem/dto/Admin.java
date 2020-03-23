package com.cp.onlinemovieticketsystem.dto;

import java.math.BigInteger;

public class Admin {
	String adminName;
	long adminId;
	String adminPassword;
	BigInteger phoneNo;
	String adminEmail;
	public Admin(String adminName,long adminId,String adminPassword,BigInteger phoneNo,String adminEmail)
	{
		this.adminName=adminName;
		this.adminId=adminId;
		this.adminPassword=adminPassword;
		this.phoneNo=phoneNo;
		this.adminEmail=adminEmail;
	}
	
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public BigInteger getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

}
