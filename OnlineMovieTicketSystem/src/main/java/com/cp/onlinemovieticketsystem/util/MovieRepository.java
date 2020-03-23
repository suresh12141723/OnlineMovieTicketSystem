package com.cp.onlinemovieticketsystem.util;

import java.util.ArrayList;
import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Movie;


public class MovieRepository {
	private static List<Movie>movieList=new ArrayList<Movie>();
	public MovieRepository()
	{
		//super();
		//userList.add(new User("Ambha",123, "Suresh", "Suresh", BigInteger.valueOf(Long.parseLong("8499932177")), "sureshjavvadi12@gmail.com"));
	}
	
	public static List<Movie> getUserList() {
		return movieList;
	}
}
	
