package com.cp.onlinemovieticketsystem.dao;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Theater;

public interface TheaterDao {
	public Theater addUserDao(Theater user);

	public List<Theater> viewUserDao();

	public Theater viewUserByUserIdDao(long userid);

	public Theater deleteUserDao(long userid);

	public Theater updateUserDao(long id);

}
