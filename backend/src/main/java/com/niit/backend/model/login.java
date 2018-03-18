package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class login {
		
		@Id
		private String loginID;
		private String loginUsername,loginPassword,loginTime,logoutTime;
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
		public String getLoginTime() {
			return loginTime;
		}
		public void setLoginTime(String loginTime) {
			this.loginTime = loginTime;
		}
		public String getLogoutTime() {
			return logoutTime;
		}
		public void setLogoutTime(String logoutTime) {
			this.logoutTime = logoutTime;
		}
		
}
