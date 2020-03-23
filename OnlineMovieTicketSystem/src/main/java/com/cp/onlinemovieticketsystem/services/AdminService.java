package com.cp.onlinemovieticketsystem.services;

import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Admin;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;


public interface AdminService {
	public Admin addUserService(Admin user);

	public List<Admin> viewUserService()throws UserListNotFoundException;
}
