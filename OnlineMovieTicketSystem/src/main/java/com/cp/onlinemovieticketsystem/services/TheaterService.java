package com.cp.onlinemovieticketsystem.services;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Theater;
import com.cp.onlinemovieticketsystem.exception.IDNotFoundException;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;

public interface TheaterService {
	public Theater addUserService(Theater user);

	public List<Theater> viewUserService()throws UserListNotFoundException;

	public Theater viewUserService(long userid);

	public Theater deleteUserService(long userid);

	public Theater updateUserService(long id);


}
