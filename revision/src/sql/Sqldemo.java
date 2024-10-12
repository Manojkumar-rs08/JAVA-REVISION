package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqldemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask22","root","Manoj123");
		Statement st= con.createStatement();
	    ResultSet rst  = st.executeQuery("select empno,emname ,job from employee1");
		
	    
	    System.out.println("empno"+ " "+"Employeename"+" "+ "job");
		
		while(rst.next()) {
			
			
			System.out.println(rst.getInt(1)+"   "+rst.getString(2)+ "   "+ rst.getString(3));
		}
		
	}

}
