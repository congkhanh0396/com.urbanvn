package com.urbanvn.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.urbanvn.entities.Employees;
import com.urbanvn.service.EmpService;
@Repository
@Transactional
public class EmpDao implements EmpService {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Employees> getListEmp() {

		return sessionFactory.getCurrentSession().createQuery("From Employees",Employees.class).list();
	}

}
