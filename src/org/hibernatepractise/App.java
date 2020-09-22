package org.hibernatepractise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatepractise.entityclass.Users;

public class App 
{
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration()
							 .configure("hibernate.cfg.xml")
							 .addAnnotatedClass(Users.class)
							 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		/* for data saving
		 * try 
		{
			Users users = new Users(5 , "Ahmed" , "ahmed@gmailcom");
			session.beginTransaction();
			session.save(users);
			session.getTransaction().commit();
			System.out.println("Row added");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
		
		
		//**********************************************************/
		
		
		/*for data retreving 
		 * try 
		{
			Users users = new Users();
			session.beginTransaction();
			users = session.get(Users.class, 5);
			session.getTransaction().commit();
			System.out.println(users);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
		
		 */
		
		//**********************************************************/
		
		/*
		 * for data updation
		 * try 
		{
			Users users = new Users();
			session.beginTransaction();
			users = session.get(Users.class, 5);
			users.setUserName("ahmed@user");
			session.getTransaction().commit();
			System.out.println(users);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
		 */
		
		//**********************************************************/
		/*
		 * for data deletion
		 * try 
		{
			Users users = new Users();
			session.beginTransaction();
			users = session.get(Users.class, 5);
			session.delete(users);
			session.getTransaction().commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
		 * 
		 */
	
	}
}
