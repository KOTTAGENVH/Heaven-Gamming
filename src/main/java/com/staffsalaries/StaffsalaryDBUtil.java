package com.staffsalaries;
//DBUtil for both staff salary and insert staff salary
import java.sql.Statement;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.heaven1.DBConnect;
import com.mysql.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.ResultSet;
public class StaffsalaryDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean inserstaffsalaries(String id,String role,String month,String payment) { //insert staff salaries
		
		boolean isSuccess = false;
		
		try {  //try catch block
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into staffsalary values ("+id+","+role+","+month+","+payment+")"; //quesry
			
			//String sql = "insert into staffsalary values (12,1,2,50000.00)";

			int rs = stmt.executeUpdate(sql);
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess; //return output
	
	}
	public static List<Staffsalary> getStaffsalary() {  //retrieve staff salaries
		
		ArrayList<Staffsalary> SS = new ArrayList<Staffsalary>(); //array list
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from staffsalary where Id ";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int Id = rs.getInt(1);
				String role = rs.getString(2);
				String month = rs.getString(3);
				String payment = rs.getString(4);
				Staffsalary s = new Staffsalary(Id,role,month,payment);
				System.out.println(role);
				SS.add(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace(); //print exception
		}
		
		return SS;	 //return output
	}


}

