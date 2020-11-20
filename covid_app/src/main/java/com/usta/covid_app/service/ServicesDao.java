package com.usta.covid_app.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.covidapp_mysql.model.Login;
import com.usta.covid_app.bean.DaoObjectMySql;
import com.usta.covid_app.bean.DaoObjectPostgresql;
import com.usta.covid_app.intarfaces.IObjectQueryPostgres;
import com.usta.covid_app.intarfaces.IObjectQueyMysql;

@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ServicesDao<T> {

	@EJB
	IObjectQueyMysql<T> mysqlDao;

	@EJB
	IObjectQueryPostgres<T> postgresDao;

	/**
	 * metodo que se encarga de crear el objeto a persistir
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void create(T t, int db) throws Exception {

		switch (db) {
		case 1:// persite Mysql
			mysqlDao.create(t);
			break;

		case 2:// periste Postgresql
			postgresDao.create(t);
			break;
		}
	}

	/**
	 * metodo encargado de buscar y listar todos los objetos de la consulta deseada
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<T> findAll(T t, int db) throws Exception {
		
		List<T> object = new ArrayList<T>();
		
		switch (db) {
		case 1:// persite Mysql
			object = mysqlDao.findAll((Class<T>) t);
			break;

		case 2:// periste Postgresql
			object = postgresDao.findAll((Class<T>) t);
			break;
		}

		return object;
	}

	/**
	 * metodo de encotrar por el id el objeto buscado
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public T findById(Integer id, Class<T> object, int db) throws Exception {

		T o = null;
		
		switch (db) {
		case 1:// persite Mysql
			o = mysqlDao.findById(id, object);
			break;

		case 2:// periste Postgresql
			o = postgresDao.findById(id, object);
			break;
		}

		return o;
	}

	/**
	 * metodo par realizar cualquier cambio o modificacion sobre un dato de un
	 * objeto
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void update(T t, int db) throws Exception {
		switch (db) {
		case 1:// persite Mysql
			mysqlDao.update(t);
			break;

		case 2:// periste Postgresql
			postgresDao.update(t);
			break;
		}
	}

	/**
	 * elimina un objeto dependiendo el id que se solicite borrar
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void delete(Integer id, Class<T> object, int db) throws Exception {
		switch (db) {
		case 1:// persite Mysql
			mysqlDao.delete(id, object);
			break;

		case 2:// periste Postgresql
			postgresDao.delete(id, object);
			break;
		}
	}
	
	/**
	 * busca el usario segun credenciales
	 * @param user
	 * @param passwrod
	 * @return
	 * @throws Exception
	 */
	public T searchUser(String user, String password, int bd) throws Exception{
		T t = null;
		switch (bd) {
			case 1:
				t = mysqlDao.searchUser(user, password);
				break;
				
			case 2:
				t = postgresDao.searchUser(user, password);
				break;
		}
		
		return t;
	}
	
	/**
	 * metodo que se encarga de buscar el usuari para traer su contrasenia
	 * @return
	 * @throws Exception
	 */
	public T searchUser(String user, int bd) throws Exception{
		T t = null;
		switch (bd) {
		case 1:
			t = mysqlDao.requiredPass(user);
			break;
			
		case 2:
			t = postgresDao.requiredPass(user);
			break;
	}
		
		return t;
	}
	
	public T searchPersonByDocument(String document, int bd) throws Exception{
		T t = null;
		switch (bd) {
			case 1:
				t = mysqlDao.searchPersonByDocument(document);
				break;
				
			case 2:
				t = postgresDao.searchPersonByDocument(document);
				break;
		}
		return t;
	}

}
