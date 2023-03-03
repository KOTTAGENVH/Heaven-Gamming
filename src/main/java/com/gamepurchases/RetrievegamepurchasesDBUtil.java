package com.gamepurchases;

import java.sql.Connection; //importing all the .jarfiles
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.heaven1.DBConnect; //importing the database connection

//Retrieving game purchase details
public class RetrievegamepurchasesDBUtil {
	public static boolean isSuccess;
	private static Connection con = null; 
	private static Statement stmt = null;
	private static ResultSet rs = null;
	  public static List<Retrievegamepurchases> getRetrievegamepurchasesDetails(){ 
		 ArrayList<Retrievegamepurchases> rgp = new ArrayList<>(); //Creating an array list
		 try {
			 con = DBConnect.getConnection(); //creating connection
			 stmt = con.createStatement();
			 String sql = "select * from gamepurchase where status = '0'"; //sql query
	         rs = stmt.executeQuery(sql);
	         
	         while(rs.next()) { //while loop to retrieve data
	        	 int Id = rs.getInt(1);
	        	 int GID = rs.getInt(2);
	        	 int Status = rs.getInt(3);
	        	String purdate = rs.getString(4);
	        	 
	        	 Retrievegamepurchases rp = new Retrievegamepurchases(Id,GID,Status,purdate); //Create an object from retrievegamepurchases class
	        	 rgp.add(rp);
	         }
		 
		 }catch(Exception e) { 
			 e.printStackTrace(); //printing exception
		 }
		 return rgp;
	  }
	  //Updating game status
	  public static boolean updategamestatus( int uid,int giD) {
		  
		  try {
			  con = DBConnect.getConnection();
			  stmt = con.createStatement();
			  String sql = "update gamepurchase set status = 1  where userId = "+uid+" and gid =  "+giD+""; //sql query
			  
			  int rs = stmt.executeUpdate(sql); //rs  variable declared to know whether the execution in a success or not (boolean)
			   
			  if(rs > 0) {  
				  isSuccess = true; 
			  }
			  else {
				  isSuccess = false;
			  }
		  }catch(Exception e) {
			  e.printStackTrace(); //print exception
		  }
		  return isSuccess; //return condition
	  }
}
