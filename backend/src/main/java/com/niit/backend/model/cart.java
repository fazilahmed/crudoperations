package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cart {
		
		@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
		private int cartId;
		private String cartUsername,cartProductname,cartProductId,cartProductPrice,cartProductQuantity;
		public int getCartId() {
			return cartId;
		}
		public void setCartId(int cartId) {
			this.cartId = cartId;
		}
		public String getCartUsername() {
			return cartUsername;
		}
		public void setCartUsername(String cartUsername) {
			this.cartUsername = cartUsername;
		}
		public String getCartProductname() {
			return cartProductname;
		}
		public void setCartProductname(String cartProductname) {
			this.cartProductname = cartProductname;
		}
		public String getCartProductId() {
			return cartProductId;
		}
		public void setCartProductId(String cartProductId) {
			this.cartProductId = cartProductId;
		}
		public String getCartProductPrice() {
			return cartProductPrice;
		}
		public void setCartProductPrice(String cartProductPrice) {
			this.cartProductPrice = cartProductPrice;
		}
		public String getCartProductQuantity() {
			return cartProductQuantity;
		}
		public void setCartProductQuantity(String cartProductQuantity) {
			this.cartProductQuantity = cartProductQuantity;
		}
		
		
		
		
}
