package com.niit.backend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.UserDao;
import com.niit.backend.model.userModel;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;

	public boolean insertUser(userModel obj) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(obj);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error obtained in registering user \n error obtained is" + e);
			return false;

		}

	}

	public List<userModel> listofusers() {
		// TODO Auto-generated method stub
		List<userModel> allusers=null;
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction= session.beginTransaction();
			allusers=session.createQuery("From userModel").list();
			transaction.commit();
			session.close();
			return allusers;
		} catch (Exception e) {
			// TODO: handle exception
			return allusers;
		}
	}
}
