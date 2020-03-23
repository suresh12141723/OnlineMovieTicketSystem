package com.cp.onlinemovieticketsystem.util;

import java.util.ArrayList;
import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Admin;

public class AdminRepository {
	private static List<Admin>userList=new ArrayList<Admin>();
	public AdminRepository()
	{
		//super();
		//userList.add(new User("Ambha",123, "Suresh", "Suresh", BigInteger.valueOf(Long.parseLong("8499932177")), "sureshjavvadi12@gmail.com"));
	}
	
	public static List<Admin> getUserList() {
		return userList;
	}
	


}
