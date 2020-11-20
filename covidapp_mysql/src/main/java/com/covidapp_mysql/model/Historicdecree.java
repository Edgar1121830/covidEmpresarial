package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the historicdecree database table.
 * 
 */
@Entity
@Table(name = "historicdecree")
public class Historicdecree implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "HistoricoDecree.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int historicID;

	private int cityID;

	@Temporal(TemporalType.DATE)
	private Date decreeDate;

	private String description;

	private String url;
	
	private Integer idDecree;

	public Historicdecree() {
	}

	public int getHistoricID() {
		return this.historicID;
	}

	public void setHistoricID(int historicID) {
		this.historicID = historicID;
	}

	public int getCityID() {
		return this.cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public Date getDecreeDate() {
		return this.decreeDate;
	}

	public void setDecreeDate(Date decreeDate) {
		this.decreeDate = decreeDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getIdDecree() {
		return idDecree;
	}

	public void setIdDecree(Integer idDecree) {
		this.idDecree = idDecree;
	}

}