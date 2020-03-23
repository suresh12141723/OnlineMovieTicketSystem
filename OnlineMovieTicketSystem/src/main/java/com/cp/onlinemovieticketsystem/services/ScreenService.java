package com.cp.onlinemovieticketsystem.services;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Screen;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;

public interface ScreenService {
	public Screen addUserService(Screen user);

	public List<Screen> viewUserService()throws UserListNotFoundException;

	public Screen viewUserService(long userid);

	public Screen deleteUserService(long userid);

	public Screen updateUserService(long id);


}

