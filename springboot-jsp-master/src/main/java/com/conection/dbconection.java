package com.conection;

public class dbconection {
	public String name="Postgre";
	public String pass="vuong120992";
	
	 String url = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "Postgre","vuong-app21:asia-northeast1:cloudcptgroud15");
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
