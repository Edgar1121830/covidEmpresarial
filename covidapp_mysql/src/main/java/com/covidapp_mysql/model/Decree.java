package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the decree database table.
 * 
 */
@Entity
@Table(name = "decree")
public class Decree implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Decree.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int decreeID;

	private String decreeNumber;

	private String description;

	private int historicID;

	public Decree() {
	}

	public int getDecreeID() {
		return this.decreeID;
	}

	public void setDecreeID(int decreeID) {
		this.decreeID = decreeID;
	}

	public String getDecreeNumber() {
		return this.decreeNumber;
	}

	public void setDecreeNumber(String decreeNumber) {
		this.decreeNumber = decreeNumber;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHistoricID() {
		return this.historicID;
	}

	public void setHistoricID(int historicID) {
		this.historicID = historicID;
	}

}