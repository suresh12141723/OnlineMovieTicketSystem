package com.cp.onlinemovieticketsystem.dao;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Movie;

//import com.cp.onlinemovieticketsystem.dto.Theater;

public interface MovieDao {
	public Movie addUserDao(Movie user);

	public List<Movie> viewUserDao();

	public Movie viewUserByUserIdDao(long userid);

	public Movie deleteUserDao(long userid);

	public Movie updateUserDao(long id);

}
