package com.cp.onlinemovieticketsystem.util;

import java.util.ArrayList;
import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Movie;
import com.cp.onlinemovieticketsystem.dto.Screen;

public class ScreenRepository {
	private static List<Screen>userList=new ArrayList<Screen>();
	public ScreenRepository()
	{
		//super();
		//userList.add(new User("Ambha",123, "Suresh", "Suresh", BigInteger.valueOf(Long.parseLong("8499932177")), "sureshjavvadi12@gmail.com"));
	}
	
	public static List<Screen> getUserList() {
		return userList;
	}
}
