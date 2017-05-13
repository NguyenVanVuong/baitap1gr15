package com.conection;

public class dbconection {
	public String name="root";
	public String pass="120992";
	
	 String url = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "edit","nhatduoc1000:asia-northeast1:nhatduoc1000");
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
