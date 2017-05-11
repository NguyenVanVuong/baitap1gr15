package com.conection;

public class dbconection {
	public String name="postgres";
	public String pass="vuong120992";
	String sql = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "btdtdm15","baitap1-myapp-167214:asia-northeast1:postgres");
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
