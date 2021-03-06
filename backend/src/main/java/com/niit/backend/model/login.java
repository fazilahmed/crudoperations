package com.niit.backend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class login {
		
		@Id
		private String loginID;
		private String loginUsername,loginPassword;
		Date loginTime,logoutTime;
		public String getLoginID() {
			return loginID;
		}
		public void setLoginID(String loginID) {
			this.loginID = loginID;
		}
		public String getLoginUsername() {
			return loginUsername;
		}
		public void setLoginUsername(String loginUsername) {
			this.loginUsername = loginUsername;
		}
		public String getLoginPassword() {
			return loginPassword;
		}
		public void setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
		}
		public Date getLoginTime() {
			return loginTime;
		}
		public void setLoginTime() {
			this.loginTime = new Date();
		}
		public Date getLogoutTime() {
			return logoutTime;
		}
		public void setLogoutTime() {
			this.logoutTime = new Date();
		}
		
}
