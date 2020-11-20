package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the city database table.
 * 
 */
@Entity
@Table(name = "city")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL="City.FIND_ALL";
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cityID;

	private String cityName;

	private int departamentID;

	public City() {
	}

	public int getCityID() {
		return this.cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getDepartamentID() {
		return this.departamentID;
	}

	public void setDepartamentID(int departamentID) {
		this.departamentID = departamentID;
	}

}