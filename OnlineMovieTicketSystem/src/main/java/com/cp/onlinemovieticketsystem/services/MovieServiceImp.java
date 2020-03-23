package com.cp.onlinemovieticketsystem.services;

import java.util.List;
import java.util.Scanner;

import com.cp.onlinemovieticketsystem.dao.MovieDao;
import com.cp.onlinemovieticketsystem.dao.MovieDaoImp;
import com.cp.onlinemovieticketsystem.dao.TheaterDao;
import com.cp.onlinemovieticketsystem.dao.TheaterDaoImp;
import com.cp.onlinemovieticketsystem.dto.Movie;
import com.cp.onlinemovieticketsystem.dto.Theater;
import com.cp.onlinemovieticketsystem.exception.IDNotFoundException;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;

public class MovieServiceImp implements MovieService{
	MovieDao userdao=new MovieDaoImp();
	Scanner sc=new Scanner(System.in);
	public Movie addUserService(Movie user)
	{
		
		Movie result=userdao.addUserDao(user);
		if(result!=null) {
			return user;
		}
		else {
			return null;
		}
		
	}
	public List<Movie> viewUserService() throws UserListNotFoundException
	{
		List<Movie> userList=userdao.viewUserDao();

		if(userList==null) {
			throw new UserListNotFoundException();
			
		}
	
		return userList;
	}
	public Movie viewUserService(long userid)
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
		Movie viewuser=userdao.viewUserByUserIdDao(userid);
		return viewuser;
	}
	public Movie deleteUserService(long userid)
	{
		if(userid==0)
		{
			return null;
		}
		Movie viewuser=userdao.deleteUserDao(userid);
		return viewuser;
	}
	public Movie updateUserService(long id)
	{
		if(id==0)
		{
		return null;
		}
		Movie user1=userdao.updateUserDao(id);
		if(user1==null)
		{
			return null;
		}
		return user1;
			
	}
	
	public long userid(long id)
	{
		
		List<Movie> userList1=userdao.viewUserDao();
		for(Movie use:userList1)
		{
			if(use.getMovieId()==id)
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

