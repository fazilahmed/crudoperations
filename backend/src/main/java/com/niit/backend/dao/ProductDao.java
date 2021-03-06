package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.product;

public interface ProductDao {

	public boolean insertproduct(product prod);
	public List<product> listofproducts();
	public product singleProduct(int prodid);
	public boolean deleteProduct(product obj);
}
