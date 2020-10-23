package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the companylogin database table.
 * 
 */
@Entity
@Table(name = "Companylogin")
public class CompanyLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "EmpresasLogin.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int companyLoginID;

	private int companyID;

	@Temporal(TemporalType.DATE)
	private Date creationDate;

	private int loginID;

	@Temporal(TemporalType.DATE)
	private Date paymentProDate;

	private int status;

	public CompanyLogin() {
	}

	public int getCompanyLoginID() {
		return this.companyLoginID;
	}

	public void setCompanyLoginID(int companyLoginID) {
		this.companyLoginID = companyLoginID;
	}

	public int getCompanyID() {
		return this.companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getLoginID() {
		return this.loginID;
	}

	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}

	public Date getPaymentProDate() {
		return this.paymentProDate;
	}

	public void setPaymentProDate(Date paymentProDate) {
		this.paymentProDate = paymentProDate;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}