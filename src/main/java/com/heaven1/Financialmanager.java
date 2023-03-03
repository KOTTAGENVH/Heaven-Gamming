package com.heaven1;

public class Financialmanager {
		private int id;
	    private String email;
	    private String userName;
	
		public Financialmanager(int id,String email, String userName) {
			super();
			this.id = id;
			this.userName = userName;
			this.email = email;
		}
		public int getId() {
			return id;
		}
		
		public String getUserName() {
			return userName;
		}
		
		public String getEmail() {
			return email;
		}
		
	
	}


