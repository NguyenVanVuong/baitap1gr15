package com.conection;

public class dbconection {
	public String name="postgres";
	public String pass="vuong120992";
	String url = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "btdtdm15","vuong-app:asia-northeast1:postgres");
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
