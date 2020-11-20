package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder.In;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Table(name = "company")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;public static final String FIND_ALL = "Company.FIND_ALL";
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int companyID;

	private String address;

	private BigDecimal cellPhone;

	private Integer checkNit;

	private String email;

	private String legalRepresentative;

	private String name;

	private BigInteger nit;

	private int quantityEmployees;

	public Company() {
	}

	public int getCompanyID() {
		return this.companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(BigDecimal cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Integer getCheckNit() {
		return this.checkNit;
	}

	public void setCheckNit(Integer checkNit) {
		this.checkNit = checkNit;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getNit() {
		return this.nit;
	}

	public void setNit(BigInteger nit) {
		this.nit = nit;
	}

	public int getQuantityEmployees() {
		return this.quantityEmployees;
	}

	public void setQuantityEmployees(int quantityEmployees) {
		this.quantityEmployees = quantityEmployees;
	}

}