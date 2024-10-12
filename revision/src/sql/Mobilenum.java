package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

public class Mobilenum {

	public static void main(String[] args) throws SQLException {

		Scanner sc= new Scanner(System.in);

		Connection con1  =DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1","root","Manoj123");
		Statement stt = con1.createStatement();
		ResultSet rss= stt.executeQuery("select * from primary1");
		

		PreparedStatement ps= con1.prepareStatement("insert into primary1 values(?,?)");
		HashMap<String,String>pri= new HashMap<>();

		System.out.println("enter the num1");
		String a = sc.next();
		System.out.println("enter the name");
		String s = sc.next();
		pri.put(a, s);

		ps.setString(1, a);
		ps.setString(2, s);

		int c=	ps.executeUpdate();  

		while(rss.next()) {


			System.out.println(rss.getString(1)+" "+rss.getString(2));

		}





		Connection con2  =DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1","root","Manoj123");
		Statement stt1 = con2.createStatement();

		ResultSet rss1= stt1.executeQuery("select * from secondary2");


		PreparedStatement ps2= con2.prepareStatement("insert into secondary2 values(?,?)");
		HashMap<String,String>sec = new HashMap<>();

		System.out.println("enter the mob num2");
		String a1 = sc.next();
		System.out.println("enter the address");
		String s1 = sc.next();
		sec.put(a1, s1);

		ps2.setString(1, a1);
		ps2.setString(2, s1);

		int d= ps2.executeUpdate();


		while(rss1.next()) {


			System.out.println(rss1.getString(1)+" "+rss1.getString(2));

		}
		
		
		
		
		if(a.contains(a1)) {
			
			
			Connection con4  =DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1","root","Manoj123");
			Statement stt4 = con4.createStatement();

			ResultSet rss4= stt4.executeQuery("select * from common");


			PreparedStatement ps4= con4.prepareStatement("insert into common values(?,?,?)");
			
			
			ps4.setString(1, a);
			ps4.setString(2, pri.get(a));
			ps4.setString(3, sec.get(a1));
			
			
			int f= ps4  .executeUpdate();
			
			
			

			System.out.println(pri.keySet()+" --"+pri.get(a)+"---"+sec.get(a1));
			//System.out.println(pri.keySet());


		}




	}

}
