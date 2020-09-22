package org.hibernatepractise.entityclass;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users 
{
	@Id
	@Column(name = "user_id")
	int userId;
	@Column(name = "user_name")
	String userName;
	@Column(name = "user_email")
	String userEmail;

	public Users(int userId, String userName, String userEmail) 
	{
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}
	
	public Users() {}

	public int getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getUserEmail()
	{
		return userEmail;
	}
	public void setUserEmail(String userEmail) 
	{
		this.userEmail = userEmail;
	}

	@Override
	public String toString() 
	{
		return "Users [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}
}
