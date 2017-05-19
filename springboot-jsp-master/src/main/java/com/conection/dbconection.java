package com.conection;

public class dbconection {
	public String name="root";
	public String pass="120992";
	
	 String url = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "edit","green-calling-160407:asia-northeast1:test1");
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
