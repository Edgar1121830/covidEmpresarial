package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the disease database table.
 * 
 */
@Entity
@Table(name = "disease")
public class Disease implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Disease.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int diseaseID;

	private String description;

	public Disease() {
	}

	public int getDiseaseID() {
		return this.diseaseID;
	}

	public void setDiseaseID(int diseaseID) {
		this.diseaseID = diseaseID;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}