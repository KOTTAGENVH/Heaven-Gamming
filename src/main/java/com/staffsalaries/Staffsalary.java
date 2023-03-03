package com.staffsalaries;

 //Java file for staff salary and retrieve staff salaries
public class Staffsalary {


		private int id;
	    private String role; //initializing all private variables
	    private String month;
	    private String payment;
	
		public Staffsalary(int id,String role, String month,String payment){
			super();
			this.id = id;          //set all variables
			this.role = role;
			this.month = month;
			this.payment =payment;
		}
		public int getId() {
			return id;         //return variables
		}
		
		
		public String getRole() {
			return role;
		}
		
		
		public String getMonth() {
			return month;
		}
		
		
		public String getPayment() {
			return payment;
	}
		

}
