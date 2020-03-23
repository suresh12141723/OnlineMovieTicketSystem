package com.cp.onlinemovieticketsystem.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.cp.onlinemovieticketsystem.dto.Admin;
import com.cp.onlinemovieticketsystem.dto.Movie;
import com.cp.onlinemovieticketsystem.dto.Screen;
import com.cp.onlinemovieticketsystem.dto.Theater;
import com.cp.onlinemovieticketsystem.exception.UserListNotFoundException;
import com.cp.onlinemovieticketsystem.services.AdminService;
import com.cp.onlinemovieticketsystem.services.AdminServiceImp;
import com.cp.onlinemovieticketsystem.services.MovieService;
import com.cp.onlinemovieticketsystem.services.MovieServiceImp;
import com.cp.onlinemovieticketsystem.services.ScreenService;
import com.cp.onlinemovieticketsystem.services.ScreenServiceImp;
import com.cp.onlinemovieticketsystem.services.TheaterService;
import com.cp.onlinemovieticketsystem.services.TheaterServiceImp;
import com.cp.onlinemovieticketsystem.services.Validation;

public class Client {
	public static void main(String args[]) throws UserListNotFoundException,ParseException
	{BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//new UserRepository();
	    AdminService admin=new AdminServiceImp();
		TheaterService userservice=new TheaterServiceImp();
		MovieService userservice1=new MovieServiceImp();
		ScreenService userservice2=new ScreenServiceImp();
		Scanner scanner=new Scanner(System.in);
	   // ScheduledFlightService scheduledFlightService=new ScheduledFlightServiceImp();
        //AirportService airportService=new AirportServiceImp();
		//PassengerService passengerservice=new PassengerService();
      //  FlightService flightservice=new FlightService();
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mma"); 
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy"); 
        SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf4=new SimpleDateFormat("hh:mma");
        
        
        System.out.println("Enter the Admin Name:");
		String adminname=scanner.next();
		System.out.println("Enter the Admin Id:");
		long adminId=scanner.nextLong();
		//long newid=userservice.userid(id);
			
		String passwordd;
		while(true) {
			System.out.println("Enter your Password");
			
			try {
				passwordd = scanner.next();
				boolean b3= Validation.validatePassword(passwordd, Validation.passwordpattern);
				if(b3==true)
				{passwordd=passwordd;
					break;}
				else
					System.out.println("Enter Again");
				}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		BigInteger bigg;
		while(true) {
			System.out.println("Enter Manager Mobile Number");
			String MobileNumber;
			
			try {
				MobileNumber = scanner.next();
				
				boolean b1= Validation.validatePhoneN(MobileNumber, Validation.phoneNumberpattern);
				if(b1==true)
				{ 
					bigg= new BigInteger(MobileNumber);
					bigg=bigg;
					break;
				}
				else
				{
					System.out.println("Enter Again");
				}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
		
       String emaill;
		while(true) {
				System.out.println("Enter Manager EmailId");
				
				try {
					emaill = scanner.next();
					boolean b2= Validation.validateEmail(emaill, Validation.emailpattern);
					if(b2==true)
					{
						emaill=emaill;
						break;
					}
					else
						System.out.println("Enter Again");
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		Admin resultt=admin.addUserService(new Admin(adminname,adminId,passwordd,bigg,emaill));
		if(resultt!=null)
		{
			System.out.println("Logged in Sucessfully");
			System.out.println(resultt.getAdminName()+" "+resultt.getAdminId()+" "+resultt.getAdminEmail()+" "+resultt.getPhoneNo());
		}
		else
		{
			System.out.println("Incorrect details");
		}
        
		Scanner sc=new Scanner(System.in);
		while(true)
		{
	
			System.out.println("Enter 1 to add Theater:");
			System.out.println("Enter 2 to display Theater:");
			System.out.println("Enter 3 to display Theater by TheaterId");
			System.out.println("Enter 4 to remove Theater by TheaterId");
			System.out.println("Enter 5 to update the Theater By ID");
			System.out.println("Enter 6 to add Movie:");
			System.out.println("Enter 7 to display Movie:");
			System.out.println("Enter 8 to display Movie by MovieId");
			System.out.println("Enter 9 to remove Movie by MovieId");
			System.out.println("Enter 10 to update the Movie By ID");
			System.out.println("Enter 11 to add Screen:");
			System.out.println("Enter 12 to display Screen:");
			System.out.println("Enter 13 to display Screen by ScreenId");
			System.out.println("Enter 14 to remove Screen by ScreenId");
			System.out.println("Enter 15 to update the Screen By ID");
			System.out.println("Enetr 16 to Exit");
			System.out.println("####################*************#########################");
			System.out.print("Please enter Your Choice:");
			int choice=sc.nextInt();
		
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter the TheaterName:");
				String usertype=sc.next();
				System.out.println("Enter the TheaterId:");
				long id=sc.nextLong();
				//long newid=userservice.userid(id);
				String username;
				while(true) {
					System.out.println("Enter the Manager Name");
					try {
						String name= br.readLine();	
						boolean b= Validation.validatename(name, Validation.namepattern);
						if(b==true) {
						username=String.valueOf(name);
						break;
						}
						else
							System.out.println("Wrong name! Enter avalid name again!");
						} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
						}
					}
					
				String password;
				while(true) {
					System.out.println("Enter your Password");
					
					try {
						password = sc.next();
						boolean b3= Validation.validatePassword(password, Validation.passwordpattern);
						if(b3==true)
						{password=password;
							break;}
						else
							System.out.println("Enter Again");
						}
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				BigInteger big;
				while(true) {
					System.out.println("Enter Manager Mobile Number");
					String MobileNumber;
					
					try {
						MobileNumber = sc.next();
						
						boolean b1= Validation.validatePhoneN(MobileNumber, Validation.phoneNumberpattern);
						if(b1==true)
						{ 
							big= new BigInteger(MobileNumber);
							big=big;
							break;
						}
						else
						{
							System.out.println("Enter Again");
						}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
				}
				
               String email;
				while(true) {
						System.out.println("Enter Manager EmailId");
						
						try {
							email = sc.next();
							boolean b2= Validation.validateEmail(email, Validation.emailpattern);
							if(b2==true)
							{
								email=email;
								break;
							}
							else
								System.out.println("Enter Again");
						}
						catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				
				
				
				Theater result=userservice.addUserService(new Theater(usertype,id,username,password,big,email));
				if(result!=null)
				{
					System.out.println("Added Sucessfully");
					System.out.println(result.getUserName()+" "+result.getUserPassword()+" "+result.getUserEmail()+" "+result.getUserPhone()+" "+result.getUserType());
				}
				else
				{
					System.out.println("Theater not added");
				}
				
				break;
			case 2:
			{
				List<Theater>userlist;
				userlist=userservice.viewUserService();
				int i=1;
				for(Theater x:userlist)
				{		
					
					System.out.println(i+" "+"ManagerName is:"+x.getUserName()+"\t"+" UserPassword is:"+x.getUserPassword());
					//System.out.println(x.getUserPassword());
					System.out.println("ManagerPhone is:"+x.getUserPhone()+"\t"+"TheaterName is:"+"\t"+x.getUserType());
					//System.out.println(x.getUserPhone());
					//System.out.println(x.getUserType());
					System.out.println("Manager Gmail is:"+x.getUserEmail()+"\t"+"TheaterId is:"+"\t"+x.getUserId());
					//System.out.println(x.getUserId());
					System.out.println("******************************");
					i++;
				}
		

			}
				break;
			case 3:
			{
				System.out.println("Enter the Theater id to know the details:");
				long userId=sc.nextLong();
				Theater obj=userservice.viewUserService(userId);
				if(obj!=null)
				{
					System.out.println(obj.getUserName()+" "+obj.getUserPassword()+" "+obj.getUserEmail()+" "+obj.getUserPhone()+" "+obj.getUserType());
				}
				else
				{
					System.out.println("Not found");
				}
				break;
			}
			case 4:
			{
				System.out.println("Enter the Theater id to know the details:");
				long userId1=sc.nextLong();
				Theater user=userservice.deleteUserService(userId1);
				if(user!=null)
				{
					System.out.println(user.getUserName()+" "+user.getUserPassword()+" "+user.getUserEmail()+" "+user.getUserPhone()+" "+user.getUserType());
					System.out.println("Theater Deleted");
				}
				else
				{
					System.out.println("Theater Not Deleted");
				}
				break;
			}
			case 5:
				
				System.out.println("Enter the id of the Theater:");
				long useridd=sc.nextLong();
				Theater users=userservice.updateUserService(useridd);
				//List<User>service=userservice.viewUserService();
				
				   
					if(users.getUserId()==useridd)
					{
						System.out.println("Enter 1 to change Name");
						System.out.println("Enter 2 to change Password");
						System.out.println("Enter 3 to change Phone number");
						System.out.println("Enter 4 to change gmail");
						System.out.println("Please enter your choice:");
						int choice1=sc.nextInt();
						switch(choice1)
						{
						case 1:

							while(true) {
								System.out.println("Enter the new Name:");
								try {
									String name= br.readLine();	
									boolean b1= Validation.validatename(name, Validation.namepattern);
									if(b1==true) {
									username=String.valueOf(name);
									break;
									}
									else
										System.out.println("Wrong name! Enter avalid name again!");
									} catch (IOException e2) {
									// TODO Auto-generated catch block
									e2.printStackTrace();
									}
								}
							
							users.setUserName(username);
							//System.out.println("The Change name is:"+users.getUserName());
							System.out.println("Name changed sucessfully");
							break;
						case 2:
							System.out.println("Enter the CurrentPassword:");
							String currentpassword=sc.next();
							if(users.getUserPassword().equals(currentpassword))
							{while(true) {
								System.out.println("Enter New Password");
								
								try {
									password = sc.next();
									boolean b3= Validation.validatePassword(password, Validation.passwordpattern);
									if(b3==true)
									{password=password;
										break;}
									else
										System.out.println("Enter Again");
									}
								catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
								users.setUserPassword(password);
								System.out.println("Password changed Sucessfully");
							}
							else
							{
								System.out.println("Incorect Password please Enter valid password: ");
							}
							break;
						case 3:
							while(true) {
								System.out.println("Enter Mobile Number");
								String MobileNumber;
								
								try {
									MobileNumber = sc.next();
									
									boolean b1= Validation.validatePhoneN(MobileNumber, Validation.phoneNumberpattern);
									if(b1==true)
									{ 
										big= new BigInteger(MobileNumber);
										big=big;
										break;
									}
									else
									{
										System.out.println("Enter Again");
									}
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
							
							}
							
							users.setUserPhone(big);
						    System.out.println("New Phone Number:"+users.getUserPassword()+" "+" is updated");
							break;
						case 4:
							while(true) {
								System.out.println("Enter  EmailId");
								
								try {
									email = sc.next();
									boolean b2= Validation.validateEmail(email, Validation.emailpattern);
									if(b2==true)
									{
										email=email;
										break;
									}
									else
										System.out.println("Enter Again");
								}
								catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							users.setUserEmail(email);
						System.out.println("New gamail is:"+users.getUserEmail()+" "+" is updated");
						
							break;
						
						
						}
					}
					
				break;
				
			
			case 6:
				System.out.println("Enter the MovieName:");
				String moviename=sc.next();
				System.out.println("Enter the MovieId:");
				long movieid=sc.nextLong();
				//long newid=userservice.userid(id);
				String moviegenre;
				while(true) {
					System.out.println("Enter the Movie Genre");
					try {
						String name= br.readLine();	
						boolean b= Validation.validatename(name, Validation.namepattern);
						if(b==true) {
						moviegenre=String.valueOf(name);
						break;
						}
						else
							System.out.println("Wrong name! Enter avalid name again!");
						} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
						}
					}
					
				
				

				
				System.out.println("Enter the Movielength:");
				long movielength=sc.nextInt();
				
				System.out.println("Enter the Movie language:");
				String language=sc.next();
				Movie result1=userservice1.addUserService(new Movie(moviename,movieid,moviegenre,movielength,language));
				if(result1!=null)
				{
					System.out.println("Added Sucessfully");
					System.out.println(result1.getMovieName()+" "+result1.getMovieId()+" "+result1.getMovieGenre()+" "+result1.getLanguages()+" "+result1.getMovieLength());
				}
				else
				{
					System.out.println("Theater not added");
				}
				
				break;
			case 7:
				List<Movie>userlist;
				userlist=userservice1.viewUserService();
				int i=1;
				for(Movie movie:userlist)
				{		
					
					System.out.println(i+" "+"Movie name is:"+movie.getMovieName()+"\t"+" movie ID is:"+movie.getMovieId());
					//System.out.println(x.getUserPassword());
					System.out.println("Movie Genre:"+movie.getMovieGenre()+"\t"+"movie length"+"\t"+movie.getMovieLength());
					//System.out.println(x.getUserPhone());
					//System.out.println(x.getUserType());
					System.out.println("Movie Language:"+movie.getLanguages());
					//System.out.println(x.getUserId());
					System.out.println("******************************");
					i++;
				}
		

			
				break;
			
			case 8:
			{
				System.out.println("Enter the Movie id to know the details:");
				long userId=sc.nextLong();
				Movie obj=userservice1.viewUserService(userId);
				if(obj!=null)
				{
					System.out.println(obj.getMovieName()+" "+obj.getMovieGenre()+" "+obj.getMovieId()+" "+obj.getMovieLength()+" "+obj.getLanguages());
				}
				else
				{
					System.out.println("Not found");
				}
				break;
			}
			case 9:
			{
				System.out.println("Enter the Movie id to know the details:");
				long userId1=sc.nextLong();
				Movie user=userservice1.deleteUserService(userId1);
				if(user!=null)
				{
					System.out.println(user.getMovieName()+" "+user.getMovieGenre()+" "+user.getMovieId()+" "+user.getMovieGenre()+" "+user.getMovieLength());
					System.out.println("Movie Deleted");
				}
				else
				{
					System.out.println("Movie Not Deleted");
				}
				break;
			}	
			
			
			case 11:
				System.out.println("Enter the ScreenName:");
				String screenname=sc.next();
				System.out.println("Enter the ScreenId:");
				long screenid=sc.nextLong();
				//long newid=userservice.userid(id);
				
				System.out.println("Enter no of rows:");
				long rows=sc.nextInt();
				
				System.out.println("Enter no of columns:");
				long columns=sc.nextInt();
				Screen result2=userservice2.addUserService(new Screen(screenname,screenid,rows,columns));
				if(result2!=null)
				{
					System.out.println("Added Sucessfully");
					System.out.println(result2.getScreenName()+" "+result2.getScreenId()+" "+result2.getRows()+" "+result2.getColumns());
				}
				else
				{
					System.out.println("Screen not added");
				}
				
				break;
				
			case 12:
				List<Screen>userlist1;
				userlist1=userservice2.viewUserService();
				int i1=1;
				for(Screen screen:userlist1)
				{		
					
					System.out.println(i1+" "+"Screen name is:"+screen.getScreenName()+"\t"+" Screen ID is:"+screen.getScreenId());
					//System.out.println(x.getUserPassword());
					System.out.println("no of rows:"+screen.getRows()+"\t"+"no of columns"+"\t"+screen.getColumns());
					//System.out.println(x.getUserPhone());
					System.out.println("******************************");
					i1++;
				}
		
				break;
				
			case 13:
			{
				System.out.println("Enter the Screen id to know the details:");
				long userId=sc.nextLong();
				Screen obj=userservice2.viewUserService(userId);
				if(obj!=null)
				{
					System.out.println(obj.getScreenName()+" "+obj.getScreenId()+" "+obj.getColumns()+" "+obj.getRows());
				}
				else
				{
					System.out.println("Not found");
				}
				break;
			}
			
			case 14:
			{
				System.out.println("Enter the Screen id to know the details:");
				long userId1=sc.nextLong();
				Screen user=userservice2.deleteUserService(userId1);
				if(user!=null)
				{
					System.out.println(user.getScreenName()+" "+user.getScreenId()+" "+user.getRows()+" "+user.getColumns());
					System.out.println("Screen Deleted");
				}
				else
				{
					System.out.println("Screen Not Deleted");
				}
				break;
			}	
			case 16 :System.exit(0);
		
			}
			
		}
		
		}
	
	}


