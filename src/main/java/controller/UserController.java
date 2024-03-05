package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import dao.UserDao;
import dto.User;	
public class UserController 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter Your Choice");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1.Save The User");
			System.out.println("2.Update The User");
			System.out.println("3.Delete The User");
			System.out.println("4.Fetch The User");
			System.out.println("5.Exit");
			int choice=Integer.parseInt(bufferedReader.readLine());
			User user=new User();
			UserDao userDao=new UserDao();
			switch(choice)
			{
			case 1:
				{
					System.out.println("Enter user name");
					String name=bufferedReader.readLine();
					System.out.println("Enter Your User Id");
					int id=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Your Phone No");
					long phNo=Long.parseLong(bufferedReader.readLine());
					System.out.println("Enter User Address");
					String address=bufferedReader.readLine();
					user.setId(id);
					user.setName(name);
					user.setAddress(address);
					user.setPhNo(phNo);
					userDao.saveUser(user);
				}
				break;
			case 2:
				{
					{
						System.out.println("Enter The id of user to be update");
						int id=Integer.parseInt(bufferedReader.readLine());
						System.out.println("Enter user name");
						String name=bufferedReader.readLine();
						System.out.println("Enter Your Phone No");
						long phNo=Long.parseLong(bufferedReader.readLine());
						System.out.println("Enter User Address");
						String address=bufferedReader.readLine();
						user.setName(name);
						user.setAddress(address);
						user.setPhNo(phNo);
						userDao.updateUser(id, user);
					}	
				}
				break;
			case 3:
				{
					System.out.println("Enter Id Of Student to be Deleted");
					int id=Integer.parseInt(bufferedReader.readLine());
					userDao.deleteUser(id);
				}
				break;
			case 4:
				{
					System.out.println("Enter Id Of Student to be Displayed");
					int id=Integer.parseInt(bufferedReader.readLine());
					userDao.fetchUser(id);
				}
				break;
			case 5:
				return ;
			default:
				System.out.println("Invalid Choice!!!!!!!!!!!!!!");
				break;
			}
		}
		catch ( IOException e) 
		{
			System.out.println(e);
		}
	
	}
}
