package com.cp.onlinemovieticketsystem.dao;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Theater;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;
import com.cp.onlinemovieticketsystem.util.TheaterRepository;

public class TheaterDaoImp implements TheaterDao{
	TheaterRepository theaterRepository=new TheaterRepository();
	List<Theater>userList=theaterRepository.getUserList();
	public Theater addUserDao(Theater user)
	{
		boolean result=userList.add(user);
		if(result) {
			return user;
		}
		else {
			return null;
		}
	}
	public List<Theater> viewUserDao()
	{
		List<Theater> userList=theaterRepository.getUserList();
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
	public Theater viewUserByUserIdDao(long userid)
	{
		List<Theater> userList=theaterRepository.getUserList();
		for(Theater user:userList)
		{
			if(user.getUserId()==userid)
				return user;
		}
		return null;
	}
	public Theater deleteUserDao(long userid)
	{
		List<Theater> userList=theaterRepository.getUserList();
		for(Theater user:userList)
		{
			if(user.getUserId()==userid)
			{
				userList.remove(user);
				return user;
			}
		}
		return null;
		
	}
	public Theater updateUserDao(long id)
	{
		List<Theater> userList=theaterRepository.getUserList();
		for(Theater user1:userList)
		{
			if(user1.getUserId()==id)
			{
				return user1;
			}
			
			
		}
		return null;
	}

}
