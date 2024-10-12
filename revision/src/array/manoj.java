package array;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 

public class manoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask22","root","Manoj123");
			Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from employee1");
	        
	      //   System.out.println("depno"+"\t"+"dname"+"\t\t"+"location"+"\t"+"hello");
	        
	        while (rs.next()){	            
	            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(5));
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
