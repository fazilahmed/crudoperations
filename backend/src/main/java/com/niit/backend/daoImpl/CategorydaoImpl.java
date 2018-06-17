package com.niit.backend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.CategoryDao;
import com.niit.backend.model.Category;
import com.niit.backend.model.userModel;

@Repository
public class CategorydaoImpl implements CategoryDao {
	
	@Autowired
	SessionFactory sessionFactory;

	
	public boolean catDao(Category cat) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(cat);
			transaction.commit();
			session.close();
			System.out.println("updated");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error obtained in registering category \n error obtained is" + e);
			return false;
		}

	}


	public List<Category> listofcategories() {
		// TODO Auto-generated method stub
		List<Category> allcategories=null;
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction= session.beginTransaction();
			allcategories=session.createQuery("From Category").list();
			transaction.commit();
			session.close();
			return allcategories;
		} catch (Exception e) {
			// TODO: handle exception
			return allcategories;
		}
	}


	public Category singleCategory(String categoryId) {
		// TODO Auto-generated method stub
		Category cat= null;
		
	
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction= session.beginTransaction();
			cat=(Category)session.get(Category.class,categoryId);
			transaction.commit();
			session.close();
			return  cat;
		} catch (Exception e) {
			// TODO: handle exception
			return cat;
		}
	}


	public boolean deleteCategory(Category cat) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction= session.beginTransaction();
			session.delete(cat);
			transaction.commit();
			session.close();
			return  true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
