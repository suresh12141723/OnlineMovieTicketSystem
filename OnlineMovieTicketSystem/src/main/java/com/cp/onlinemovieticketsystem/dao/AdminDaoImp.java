package com.cp.onlinemovieticketsystem.dao;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Admin;
import com.cp.onlinemovieticketsystem.util.AdminRepository;

public class AdminDaoImp implements AdminDao{
	AdminRepository adminRepository=new AdminRepository();
	List<Admin>userList=AdminRepository.getUserList();
	public Admin addUserDao(Admin user)
	{
		boolean result=userList.add(user);
		if(result) {
			return user;
		}
		else {
			return null;
		}
	}
	public List<Admin> viewUserDao() {
		// TODO Auto-generated method stub
		return null;
	}
}