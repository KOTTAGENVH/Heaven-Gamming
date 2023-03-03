package com.heaven1;

import java.sql.Connection; //importing all the .jarfiles
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

public class CatidDBUtil {
	public static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	 public static List<Catid> getCatidDetails(int id){
		  
		 // int convertedID = Integer.parseInt(Id); 
		  
		  ArrayList<Catid> cat = new ArrayList<Catid>(); //Creating an array list
		  
		  try {
			con = DBConnect.getConnection(); 
			stmt = con.createStatement(); //creating connection
			String sql = "SELECT catId FROM fmpc where fmId = "+id+""; //sql query
		    rs = stmt.executeQuery(sql);
		    
		    while(rs.next()) { //while loop to retrieve data
		    	int catid = rs.getInt(1);
		    	
		    	Catid cid = new Catid(catid); //Create an object from retrievegamepurchases class
		    	cat.add(cid);
		    }
		  }catch(Exception e) {
			  e.printStackTrace();//printing exception
		  }
		  return cat;
		  
	  }

	 //DELETE Catid
	 public static boolean deleteCatid(int id,String catId) {
		 
		 try {
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "delete from fmpc where catId = '"+catId+"' and fmId = "+id+"";
			 int r = stmt.executeUpdate(sql);  //r  variable declared to know whether the execution in a success or not (boolean)
			 if(r>0) {
				 isSuccess = true;
			 }else {
				 isSuccess = false;
			 }
		 }catch (Exception e) {
			 e.printStackTrace(); //print exception
		 }
		 return isSuccess; //return condition
	 }
	 
	 //Insert Catid
	 public static boolean insertCatid(int id,int catId) {
		 
		
		 try {
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "insert into fmpc (fmId,catId) values ("+id+","+catId+")";
			int rs = stmt.executeUpdate(sql);
			 
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess = false;
			}
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 return isSuccess;
	 }
	 
}
