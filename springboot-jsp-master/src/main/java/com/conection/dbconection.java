package com.conection;

public class dbconection {
	public String name="Postgres";
	public String pass="vuong120992";
	
	 String url = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "Postgres","vuong-app21:asia-northeast1:cloudcptgroud15");
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
