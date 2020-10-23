package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the enfermedades database table.
 * 
 */
@Entity
@Table(name="enfermedades")
public class Disease implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Disease.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_enfermedad")
	private Integer diseaseID;

	@Column(name = "descricion")
	private String description;

	public Disease() {
	}

	public Integer getDiseaseID() {
		return diseaseID;
	}

	public void setDiseaseID(Integer diseaseID) {
		this.diseaseID = diseaseID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}