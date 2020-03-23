package com.cp.onlinemovieticketsystem.dao;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Movie;
import com.cp.onlinemovieticketsystem.dto.Theater;
//import com.cp.onlinemovieticketsystem.dto.Theater;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;
import com.cp.onlinemovieticketsystem.util.MovieRepository;
import com.cp.onlinemovieticketsystem.util.TheaterRepository;

public class MovieDaoImp implements MovieDao{
	TheaterRepository theaterRepository=new TheaterRepository();
	List<Movie>userList=MovieRepository.getUserList();
	public Movie addUserDao(Movie user)
	{
		boolean result=userList.add(user);
		if(result) {
			return user;
		}
		else {
			return null;
		}
	}
	public List<Movie> viewUserDao()
	{
		List<Movie> userList=MovieRepository.getUserList();
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
	public Movie viewUserByUserIdDao(long userid)
	{
		List<Movie> userList=MovieRepository.getUserList();
		for(Movie user:userList)
		{
			if(user.getMovieId()==userid)
				return user;
		}
		return null;
	}
	public Movie deleteUserDao(long userid)
	{
		List<Movie> userList=MovieRepository.getUserList();
		for(Movie user:userList)
		{
			if(user.getMovieId()==userid)
			{
				userList.remove(user);
				return user;
			}
		}
		return null;
		
	}
	public Movie updateUserDao(long id)
	{
		List<Movie> userList=MovieRepository.getUserList();
		for(Movie user1:userList)
		{
			if(user1.getMovieId()==id)
			{
				return user1;
			}
			
			
		}
		return null;
	}
}
