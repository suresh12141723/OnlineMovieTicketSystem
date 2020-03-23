package com.cp.onlinemovieticketsystem.services;

import java.util.List;
import java.util.Scanner;

import com.cp.onlinemovieticketsystem.dao.AdminDao;
import com.cp.onlinemovieticketsystem.dao.AdminDaoImp;
import com.cp.onlinemovieticketsystem.dto.Admin;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;

public class AdminServiceImp implements AdminService{
	AdminDao userdao=new AdminDaoImp();
	Scanner sc=new Scanner(System.in);
	public Admin addUserService(Admin user)
	{
		
		Admin result=userdao.addUserDao(user);
		if(result!=null) {
			return user;
		}
		else {
			return null;
		}
		
	}
	public List<Admin> viewUserService() throws UserListNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
