package dao;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import dto.User;
public class UserDao 
{
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("persistence").createEntityManager();
	}
	public void saveUser(User user)
	{
		EntityManager entityManager=getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		System.out.println("User Saved Successfully");
	}
	public void updateUser(int id,User user)
	{
		EntityManager entityManager=getEntityManager();
		User dbUser=entityManager.find(User.class,id);
		if(dbUser!=null)
		{
			entityManager.getTransaction().begin();
			user.setId(id);
			entityManager.merge(user);
			entityManager.getTransaction().commit();
			System.out.println("User Updated Successfully");
		}
		else
		{
			System.out.println("User Does Not Exist");
		}
	}
	public void deleteUser(int id)
	{
		EntityManager entityManager=getEntityManager();
		User dbUser=entityManager.find(User.class,id);
		if(dbUser!=null)
		{
			entityManager.getTransaction().begin();
			entityManager.remove(dbUser);
			entityManager.getTransaction().commit();
			System.out.println("User Deleted Sucessfully");
		}
		else
		{
			System.out.println("User Not Found");
		}
	}
	public void fetchUser(int id)
	{
		EntityManager entityManager=getEntityManager();
		User dbUser=entityManager.find(User.class, id);
		if(dbUser!=null)
		{
			System.out.println(dbUser);
		}
		else
		{
			System.out.println("User Not Found");
		}
	}
}
