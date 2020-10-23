package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the decretos database table.
 * 
 */
@Entity
@Table(name = "decretos")
public class Decree implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Decree.FIND_ALL";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_decreto")
	private Integer decreeID;

	
	@Column(name = "descripcio")
	private String description;

	@Column(name = "numero_decreto")
	private String decreeNumber;

	public Decree() {
	}

	public Integer getDecreeID() {
		return decreeID;
	}

	public void setDecreeID(Integer decreeID) {
		this.decreeID = decreeID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDecreeNumber() {
		return decreeNumber;
	}

	public void setDecreeNumber(String decreeNumber) {
		this.decreeNumber = decreeNumber;
	}

}