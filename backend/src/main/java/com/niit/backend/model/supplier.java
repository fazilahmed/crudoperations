package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class supplier {
		
		@Id
		private String supplierId;
		private String supplierName,supplierAddress,supplierEmail,supplierContact;
		public String getSupplierId() {
			return supplierId;
		}
		public void setSupplierId(String supplierId) {
			this.supplierId = supplierId;
		}
		public String getSupplierName() {
			return supplierName;
		}
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		public String getSupplierAddress() {
			return supplierAddress;
		}
		public void setSupplierAddress(String supplierAddress) {
			this.supplierAddress = supplierAddress;
		}
		public String getSupplierEmail() {
			return supplierEmail;
		}
		public void setSupplierEmail(String supplierEmail) {
			this.supplierEmail = supplierEmail;
		}
		public String getSupplierContact() {
			return supplierContact;
		}
		public void setSupplierContact(String supplierContact) {
			this.supplierContact = supplierContact;
		}
		
}