package com.cp.onlinemovieticketsystem.dao;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Screen;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;
import com.cp.onlinemovieticketsystem.util.ScreenRepository;

public class ScreenDaoImp implements ScreenDao{
	ScreenRepository screenRepository=new ScreenRepository();
	List<Screen>userList=ScreenRepository.getUserList();
	public Screen addUserDao(Screen user)
	{
		boolean result=userList.add(user);
		if(result) {
			return user;
		}
		else {
			return null;
		}
	}
	public List<Screen> viewUserDao()
	{
		List<Screen> userList=ScreenRepository.getUserList();
		try {
		if(userList==null) {
			throw new UserListNotFoundException();
		}
		}
		catch(UserListNotFoundException e)
		{
			e.printStackTrace();
		}
		return userList;
	}
	public Screen viewUserByUserIdDao(long userid)
	{
		List<Screen> userList=ScreenRepository.getUserList();
		for(Screen user:userList)
		{
			if(user.getScreenId()==userid)
				return user;
		}
		return null;
	}
	public Screen deleteUserDao(long userid)
	{
		List<Screen> userList=ScreenRepository.getUserList();
		for(Screen user:userList)
		{
			if(user.getScreenId()==userid)
			{
				userList.remove(user);
				return user;
			}
		}
		return null;
		
	}
	public Screen updateUserDao(long id)
	{
		List<Screen> userList=ScreenRepository.getUserList();
		for(Screen user1:userList)
		{
			if(user1.getScreenId()==id)
			{
				return user1;
			}
			
			
		}
		return null;
	}

}
