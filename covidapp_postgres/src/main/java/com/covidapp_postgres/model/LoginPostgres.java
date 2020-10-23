package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the login database table.
 * 
 */
@Entity
@Table(name = "login")
public class LoginPostgres implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL= "Login.FIND_ALL";
	
	public static final String FIND_USER_CREDENTIALS_POSTGRESQL = "LoginPostgres.FIND_USER_CREDENTIALS_POSTGRESQL";
	
	public static final String FIND_USER = "LoginPostgres.FIND_USER";


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_login")
	private Integer loginID;

	@Column(name = "clave")
	private String password;

	@Column(name = "usuario")
	private String user;

	public LoginPostgres() {
	}

	public Integer getLoginID() {
		return loginID;
	}

	public void setLoginID(Integer loginID) {
		this.loginID = loginID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


}