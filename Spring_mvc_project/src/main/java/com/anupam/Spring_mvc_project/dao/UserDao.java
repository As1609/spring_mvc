package com.anupam.Spring_mvc_project.dao;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anupam.Spring_mvc_project.model.User;

@Repository
public class UserDao {
	
	@Autowired 
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {

		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}

}
