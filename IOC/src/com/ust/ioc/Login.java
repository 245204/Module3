package com.ust.ioc;

public class Login {
	private String username;
	private String password;
	DBConnection db; //dependency and not instance variable ..done through injection
	


	public String validate() {
		//obtain connection to database and write sql to verify 
		//username and password existing database
		//DBConnection db=new DBConnection();
		
		
//	db=new DBConnection();
		Connection con= db.getConnection();
		
		return "Login Validated.....";	
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DBConnection getDb() {
		return db;
	}

	public void setDb(DBConnection db) {
		this.db = db;
	}
	

}
