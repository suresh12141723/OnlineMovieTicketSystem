package com.cp.onlinemovieticketsystem.dao;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Screen;


public interface ScreenDao {
	public Screen addUserDao(Screen user);

	public List<Screen> viewUserDao();

	public  Screen viewUserByUserIdDao(long userid);

	public Screen deleteUserDao(long userid);

	public Screen updateUserDao(long id);

}

