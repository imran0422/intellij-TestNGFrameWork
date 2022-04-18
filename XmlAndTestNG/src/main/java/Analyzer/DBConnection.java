package Analyzer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
  public static void main(String[] args) throws SQLException  {
	  
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
		
		
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:8080/xe","hr","password");
		/*
		 * Statement stmt = co.createStatement(); String S = "select * from employees";
		 * ResultSet rs = stmt.executeQuery(S);
		 * 
		 * while(rs.next()) { String firstName = rs.getString("first_name");
		 * System.out.println(firstName); }
		 */
		System.out.println("connection success");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
