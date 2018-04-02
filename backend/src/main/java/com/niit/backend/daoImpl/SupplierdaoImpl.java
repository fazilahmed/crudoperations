package com.niit.backend.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.SupplierDao;
import com.niit.backend.model.supplier;

@Repository
public class SupplierdaoImpl implements SupplierDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public boolean supDao(supplier sup) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(sup);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error obtained in registering supplier \n error obtained is" + e);
			return false;
		}
	}

}
