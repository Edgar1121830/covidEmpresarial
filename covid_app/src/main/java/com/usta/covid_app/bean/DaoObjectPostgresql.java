package com.usta.covid_app.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.covidapp_mysql.model.Login;
import com.covidapp_postgres.model.LoginPostgres;
import com.usta.covid_app.intarfaces.IObjectQueryPostgres;
import com.usta.covid_app.intarfaces.IObjectQueyMysql;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DaoObjectPostgresql<T> implements IObjectQueryPostgres<T> {

	@PersistenceContext(unitName = "covid_app_postgres")
	EntityManager postgresEnetity;
	
	@Override
	public void create(T t) throws Exception {
		postgresEnetity.persist(t);		
	}

	@Override
	public List<T> findAll(Class<T> t) throws Exception {
		List<T> object = new ArrayList<T>();
		
		Query querySql = postgresEnetity.createNamedQuery(t.getSimpleName()+".FIND_ALL");//Armo la consulta
		
		object = querySql.getResultList();//trae los datos de la consulta.
		
		return object;
	}

	@Override
	public T findById(Integer id, Class<T> object) throws Exception {
		T t = null;
		
		//Opcion 1
		//Query q  = postgresEnetity.createNamedQuery(object.getSimpleName()+"FIND_BY_ID");
		//q.setParameter("id", id);
		
		//Opcion 2
		t = postgresEnetity.find(object, id);
		
		return t;
	}

	@Override
	public void update(T t) throws Exception {
		postgresEnetity.merge(t);
		
	}

	@Override
	public void delete(Integer id, Class<T> object) throws Exception {
		T t = findById(id, object);
		
		if(t!=null) {
			postgresEnetity.remove(t);
		}
		
	}

	@Override
	public T searchUser(String user, String password) throws Exception {
		T t= null;
		try {
			Query q = postgresEnetity.createNamedQuery(LoginPostgres.FIND_USER_CREDENTIALS_POSTGRESQL);
			
			q.setParameter("us", user);
			q.setParameter("ps", password);
			
			t = (T) q.getSingleResult();
			
		} catch (Exception e) {
			t = null;
		}
		
		return t;
	}

	@Override
	public T requiredPass(String user) throws Exception {
		T t = null;
		
		Query q = postgresEnetity.createNamedQuery(LoginPostgres.FIND_USER);
		q.setParameter("us", user);
		
		try {
			t = (T) q.getSingleResult();
		} catch (NoResultException e) {
			t = null;
		}
		
		return t;
	}

	@Override
	public T searchPersonByDocument(String documento) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
