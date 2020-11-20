package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the login database table.
 * 
 */
@Entity
@Table(name = "login")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL= "Login.FIND_ALL";
	
	public static final String FIND_USER_CREDENTIALS_MYSQL = "Login.FIND_USER_CREDENTIALS_MYSQL";
	
	public static final String FIND_USER = "Login.FIND_USER";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loginID;

	private String password;

	private String user;

	public Login() {
	}

	public int getLoginID() {
		return this.loginID;
	}

	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}