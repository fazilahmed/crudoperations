package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class userModel {

		@Id
		private String userName;
		private String userPassword, userConfirmPassword,userEmail,userCity,userAddress;
		private String userAge,userContact;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public String getUserConfirmPassword() {
			return userConfirmPassword;
		}
		public void setUserConfirmPassword(String userConfirmPassword) {
			this.userConfirmPassword = userConfirmPassword;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public String getUserCity() {
			return userCity;
		}
		public void setUserCity(String userCity) {
			this.userCity = userCity;
		}
		public String getUserAddress() {
			return userAddress;
		}
		public void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
		}
		public String getUserAge() {
			return userAge;
		}
		public void setUserAge(String userAge) {
			this.userAge = userAge;
		}
		public String getUserContact() {
			return userContact;
		}
		public void setUserContact(String userContact) {
			this.userContact = userContact;
		}

		
		
}
