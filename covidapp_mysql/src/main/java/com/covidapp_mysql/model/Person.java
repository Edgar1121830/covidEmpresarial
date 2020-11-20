package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@Table(name = "person")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL= "Person.FIND_ALL";
	public static final String FIND_BY_DOCUMENT= "Person.FIND_BY_DOCUMENT";
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int personID;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private BigDecimal cellPhone;

	private int cityID;

	private String document;

	private int documentTypeID;

	private String email;

	private String firstName;

	private String gender;

	private float height;

	private String lastName;

	private String lastName2;

	private String middleName;

	private String rhBlood;

	private float weight;

	public Person() {
	}

	public int getPersonID() {
		return this.personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public BigDecimal getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(BigDecimal cellPhone) {
		this.cellPhone = cellPhone;
	}

	public int getCityID() {
		return this.cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getDocument() {
		return this.document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public int getDocumentTypeID() {
		return this.documentTypeID;
	}

	public void setDocumentTypeID(int documentTypeID) {
		this.documentTypeID = documentTypeID;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName2() {
		return this.lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getRhBlood() {
		return this.rhBlood;
	}

	public void setRhBlood(String rhBlood) {
		this.rhBlood = rhBlood;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}