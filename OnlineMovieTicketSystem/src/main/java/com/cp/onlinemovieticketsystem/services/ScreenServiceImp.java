package com.cp.onlinemovieticketsystem.services;

import java.util.List;
import java.util.Scanner;

import com.cp.onlinemovieticketsystem.dao.ScreenDao;
import com.cp.onlinemovieticketsystem.dao.ScreenDaoImp;
import com.cp.onlinemovieticketsystem.dto.Screen;
import com.cp.onlinemovieticketsystem.exception.IDNotFoundException;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;

public class ScreenServiceImp implements ScreenService{
	ScreenDao userdao=new ScreenDaoImp();
	Scanner sc=new Scanner(System.in);
	public Screen addUserService(Screen user)
	{
		
		Screen result=userdao.addUserDao(user);
		if(result!=null) {
			return user;
		}
		else {
			return null;
		}
		
	}
	public List<Screen> viewUserService() throws UserListNotFoundException
	{
		List<Screen> userList=userdao.viewUserDao();

		if(userList==null) {
			throw new UserListNotFoundException();
			
		}
	
		return userList;
	}
	public Screen viewUserService(long userid)
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
		Screen viewuser=userdao.viewUserByUserIdDao(userid);
		return viewuser;
	}
	public Screen deleteUserService(long userid)
	{
		if(userid==0)
		{
			return null;
		}
		Screen viewuser=userdao.deleteUserDao(userid);
		return viewuser;
	}
	public Screen updateUserService(long id)
	{
		if(id==0)
		{
		return null;
		}
		Screen user1=userdao.updateUserDao(id);
		if(user1==null)
		{
			return null;
		}
		return user1;
			
	}
	
	public long userid(long id)
	{
		
		List<Screen> userList1=userdao.viewUserDao();
		for(Screen use:userList1)
		{
			if(use.getScreenId()==id)
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
