package com.usta.cmapp.control;

import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "principal")
@SessionScoped
public class PrincipalController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Properties properties;
	private String userAcces;
	private final static String PAGE_PRINCIPAL = "../login/login.faces";
	
	/**
	 * constructor class
	 */
	public PrincipalController() {
		
		try {
			properties = new Properties(); 
			userAcces = null;
			chargeProperties();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * init variables 
	 */
	private void chargeProperties() {
		try {
			properties.load(PrincipalController.class.getResourceAsStream("messages.properties"));
			userAcces = ((String) FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().get(LoginController.USER_AUTENTICH)).toUpperCase();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, properties.getProperty("errorGeneral")
							, properties.getProperty("errorCargaPropiedades")));
		}
	}
	
	/**
	 * este metodo se inicializa tan pronto se carga la clase
	 * y despues que crea el constructor 
	 * No recibi de ningun cliente, el cliente es el mismo servidor
	 * cuando la aplicacion es inicializada.
	 */
	@PostConstruct
	public void chargeData() {
		try {
			
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, properties.getProperty("errorGeneral")
							, properties.getProperty("errorCargaPropiedades")));
		}
	}
	
	
	public void logut() {
	
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("principal");
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(LoginController.USER_AUTENTICH);
			FacesContext.getCurrentInstance().getExternalContext().redirect(PAGE_PRINCIPAL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUserAcces() {
		return userAcces;
	}

	public void setUserAcces(String userAcces) {
		this.userAcces = userAcces;
	}
	
}
