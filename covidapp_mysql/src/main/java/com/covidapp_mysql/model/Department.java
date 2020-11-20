package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@Table(name = "department")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Departament.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int departamentID;

	private int country;

	private String name;

	public Department() {
	}

	public int getDepartamentID() {
		return this.departamentID;
	}

	public void setDepartamentID(int departamentID) {
		this.departamentID = departamentID;
	}

	public int getCountry() {
		return this.country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}