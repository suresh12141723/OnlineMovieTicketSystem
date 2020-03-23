package com.cp.onlinemovieticketsystem.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Theater;

public class TheaterRepository {
	private static List<Theater>userList=new ArrayList<Theater>();
	public TheaterRepository()
	{
		//super();
		//userList.add(new User("Ambha",123, "Suresh", "Suresh", BigInteger.valueOf(Long.parseLong("8499932177")), "sureshjavvadi12@gmail.com"));
	}
	
	public List<Theater> getUserList() {
		return userList;
	}
	


}
