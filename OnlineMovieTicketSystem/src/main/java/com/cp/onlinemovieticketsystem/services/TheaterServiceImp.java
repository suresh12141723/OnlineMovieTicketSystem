package com.cp.onlinemovieticketsystem.services;



import java.util.List;
import java.util.Scanner;

import com.cp.onlinemovieticketsystem.dao.TheaterDao;
import com.cp.onlinemovieticketsystem.dao.TheaterDaoImp;
import com.cp.onlinemovieticketsystem.dto.Theater;
import com.cp.onlinemovieticketsystem.exception.IDNotFoundException;
import com.cp.onlinemovieticketsystem.exception.NumberFormatE;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;

public class TheaterServiceImp implements TheaterService{
	TheaterDao userdao=new TheaterDaoImp();
	Scanner sc=new Scanner(System.in);
	public Theater addUserService(Theater user)
	{
		
		Theater result=userdao.addUserDao(user);
		if(result!=null) {
			return user;
		}
		else {
			return null;
		}
		
	}
	public List<Theater> viewUserService() throws UserListNotFoundException
	{
		List<Theater> userList=userdao.viewUserDao();

		if(userList==null) {
			throw new UserListNotFoundException();
			
		}
	
		return userList;
	}
	public Theater viewUserService(long userid)
	{
		try {
		  if(userid==0)
		    {
			throw new IDNotFoundException();
		    }
	   }
		catch(IDNotFoundException e)
		{
			e.printStackTrace();
		}
		Theater viewuser=userdao.viewUserByUserIdDao(userid);
		return viewuser;
	}
	public Theater deleteUserService(long userid)
	{
		if(userid==0)
		{
			return null;
		}
		Theater viewuser=userdao.deleteUserDao(userid);
		return viewuser;
	}
	public Theater updateUserService(long id)
	{
		if(id==0)
		{
		return null;
		}
		Theater user1=userdao.updateUserDao(id);
		if(user1==null)
		{
			return null;
		}
		return user1;
			
	}
	
	public long userid(long id)
	{
		
		List<Theater> userList1=userdao.viewUserDao();
		for(Theater use:userList1)
		{
			if(use.getUserId()==id)
			{
				System.out.println("\n Id Already Exists:");
				System.out.println("\nPlease enter another id:");
				id=sc.nextLong();
				return userid(id);
			}
			
				
		}
		return id;
			
	}
	
	
}
