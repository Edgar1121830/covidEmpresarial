package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ciudades database table.
 * 
 */
@Entity
@Table(name="ciudades")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL="City.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ciudad")
	private Integer cityID;

	@Column(name="id_departamento")
	private Integer departamentID;

	@Column(name = "nombre")
	private String cityName;

	public City() {
	}

	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	public Integer getDepartamentID() {
		return departamentID;
	}

	public void setDepartamentID(Integer departamentID) {
		this.departamentID = departamentID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


}