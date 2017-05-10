package com.conection;

public class dbconection {
	public String name="root";
	public String pass="121212";
	
	
	String url = "jdbc:mysql://127.0.0.1:3306/sakila";
	public String getURL()
	{
		return url;
	}
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}

}
