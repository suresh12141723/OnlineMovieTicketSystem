package com.cp.onlinemovieticketsystem.services;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Movie;
import com.cp.onlinemovieticketsystem.dto.Theater;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;

public interface MovieService {
	public Movie addUserService(Movie user);

	public List<Movie> viewUserService()throws UserListNotFoundException;

	public Movie viewUserService(long userid);

	public Movie deleteUserService(long userid);

	public Movie updateUserService(long id);


}

