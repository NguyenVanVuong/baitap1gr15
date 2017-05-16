package com.conection;

public class dbconection {
	public String name="root";
	public String pass="123456789";
	
	 String url = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "mydata","groupg15final:asia-northeast1:mysql");
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
