package com.cp.onlinemovieticketsystemservicetest;

import java.math.BigInteger;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cp.onlinemovieticketsystem.dao.TheaterDaoImp;
import com.cp.onlinemovieticketsystem.dto.Theater;

public class TheaterDaoTest {
	TheaterDaoImp userdao=new TheaterDaoImp();
	@Test
	public void addUserServiceTest()
	{
		Theater user=new Theater("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(userdao.addUserDao(user),user);
	}
	@Test
	public void viewUserService()
	{
		List<Theater> userlist=userdao.viewUserDao();
		Assertions.assertEquals(123,userlist.get(0).getUserId());
	}
	

}
