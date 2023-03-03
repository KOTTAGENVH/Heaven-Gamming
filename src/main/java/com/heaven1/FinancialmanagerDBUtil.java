package com.heaven1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class FinancialmanagerDBUtil {
    
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
		public static boolean validate(String username,String password) {
		
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from userslogin where username='"+username+"'and password='"+password+"'";
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					isSuccess = true;
				}else {
					isSuccess = false;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
		}
	
	
	public static List<Financialmanager> getFinancialmanager(String userName) {
		
		ArrayList<Financialmanager> FM = new ArrayList<Financialmanager>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from financialmanager where username ='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int ID = rs.getInt(1);
				String usernam = rs.getString(2);
				String email = rs.getString(3);
				Financialmanager Fm = new Financialmanager(ID,usernam,email);
				FM.add(Fm);
							}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return FM;	
	}



	
 


}
