package com.cp.onlinemovieticketsystemservicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cp.onlinemovieticketsystem.dao.TheaterDaoImp;
import com.cp.onlinemovieticketsystem.dto.Theater;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;
import com.cp.onlinemovieticketsystem.services.TheaterServiceImp;

public class TheaterServiceTest {
	
	
	TheaterServiceImp userservice=new TheaterServiceImp();
	//FlightService flightservice=new FlightService();
	
	@Test
	public void addUserServiceTest()
	{
		Theater user=new Theater("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(userservice.addUserService(user),user);
	}
		
	@Test
	public void viewUserService() throws UserListNotFoundException
	{
		List<Theater> userlist=userservice.viewUserService();
		Assertions.assertEquals(123,userlist.get(0).getUserId());
	}
	@Test
	public void viewUserByuserId()
	{
		Theater user=new Theater("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(user.getUserId(),userservice.viewUserService(123).getUserId());
	}
	@Test
	public void updateuserByuserId()
	{
		Theater user=new Theater("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(null,userservice.updateUserService(12));
	}
	@Test
	public void deleteByuserId()
	{
		Theater user=new Theater("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(null,userservice.updateUserService(13));
	}
	@Test
	public void deleteByuserIds()
	{
		Theater user=new Theater("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(user.getUserId(),userservice.updateUserService(123).getUserId());
	}
	
	
	
}
