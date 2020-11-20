package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the register database table.
 * 
 */
@Entity
@Table(name = "register")
public class Register implements Serializable {
	private static final long serialVersionUID = 1L;
	

	public static final String FIND_ALL= "Register.FIND_ALL";
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int registerID;

	private int companyID;

	private int diseaseID;

	@Temporal(TemporalType.TIMESTAMP)
	private Date entryDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date exitDate;

	private byte ingress;

	private int personID;

	private byte symptom;

	private int temperature;

	public Register() {
	}

	public int getRegisterID() {
		return this.registerID;
	}

	public void setRegisterID(int registerID) {
		this.registerID = registerID;
	}

	public int getCompanyID() {
		return this.companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public int getDiseaseID() {
		return this.diseaseID;
	}

	public void setDiseaseID(int diseaseID) {
		this.diseaseID = diseaseID;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getExitDate() {
		return this.exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public byte getIngress() {
		return this.ingress;
	}

	public void setIngress(byte ingress) {
		this.ingress = ingress;
	}

	public int getPersonID() {
		return this.personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public byte getSymptom() {
		return this.symptom;
	}

	public void setSymptom(byte symptom) {
		this.symptom = symptom;
	}

	public int getTemperature() {
		return this.temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

}