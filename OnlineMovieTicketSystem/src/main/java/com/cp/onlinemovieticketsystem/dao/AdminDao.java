package com.cp.onlinemovieticketsystem.dao;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Admin;

public interface AdminDao {
	public Admin addUserDao(Admin user);

	public List<Admin> viewUserDao();

}

