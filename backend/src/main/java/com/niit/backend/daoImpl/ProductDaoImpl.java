package com.niit.backend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.ProductDao;
import com.niit.backend.model.product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean insertproduct(product prod) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(prod);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error obtained in registering product \n error obtained is" + e);
			return false;
		}
	}

	public List<product> listofproducts() {
		// TODO Auto-generated method stub
		List<product> allproducts=null;
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction= session.beginTransaction();
			allproducts=session.createQuery("From product").list();
			transaction.commit();
			session.close();
			return allproducts;
		} catch (Exception e) {
			// TODO: handle exception
			return allproducts;
		}
		
	}

	public product singleProduct(int productId) {
		// TODO Auto-generated method stub
		product obj= null;
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction= session.beginTransaction();
			obj=(product)session.get(product.class, productId);
			transaction.commit();
			session.close();
			return obj;
		} catch (Exception e) {
			// TODO: handle exception
			return obj;
		}
	}

	public boolean deleteProduct(product obj) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction= session.beginTransaction();
			session.delete(obj);
			transaction.commit();
			session.close();
			return  true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}



}
