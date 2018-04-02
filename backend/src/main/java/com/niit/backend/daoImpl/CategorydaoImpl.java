package com.niit.backend.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.CategoryDao;
import com.niit.backend.model.Category;

@Repository
public class CategorydaoImpl implements CategoryDao {
	
	@Autowired
	SessionFactory sessionFactory;

	
	public boolean catDao(Category cat) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(cat);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error obtained in registering category \n error obtained is" + e);
			return false;
		}

	}
}
