package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class product {
			
			@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
			private int productId;
			private String productQuantity,productPrice,product,productName,productDescription,productSuplier,productCategory;
			public int getProductId() {
				return productId;
			}
			public void setProductId(int productId) {
				this.productId = productId;
			}
			public String getProductQuantity() {
				return productQuantity;
			}
			public void setProductQuantity(String productQuantity) {
				this.productQuantity = productQuantity;
			}
			public String getProductPrice() {
				return productPrice;
			}
			public void setProductPrice(String productPrice) {
				this.productPrice = productPrice;
			}
			public String getProduct() {
				return product;
			}
			public void setProduct(String product) {
				this.product = product;
			}
			public String getProductName() {
				return productName;
			}
			public void setProductName(String productName) {
				this.productName = productName;
			}
			public String getProductDescription() {
				return productDescription;
			}
			public void setProductDescription(String productDescription) {
				this.productDescription = productDescription;
			}
			public String getProductSuplier() {
				return productSuplier;
			}
			public void setProductSuplier(String productSuplier) {
				this.productSuplier = productSuplier;
			}
			public String getProductCategory() {
				return productCategory;
			}
			public void setProductCategory(String productCategory) {
				this.productCategory = productCategory;
			}
			
				
}
