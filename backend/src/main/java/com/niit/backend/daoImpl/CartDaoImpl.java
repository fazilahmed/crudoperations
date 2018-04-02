package com.niit.backend.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.CartDao;
import com.niit.backend.model.cart;

@Repository
public class CartDaoImpl implements CartDao {
	
	@Autowired
	SessionFactory sessionFactory; 

	public boolean insertcart(cart car) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(car);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error obtained in registering cart \n error obtained is" + e);
			return false;
		}
	}

}
