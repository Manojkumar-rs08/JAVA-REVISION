package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Studentdatabase {


	Scanner sc = new Scanner(System.in);



	static	void operations() throws SQLException
	{


		Scanner sc = new Scanner(System.in);

		Connection con1  =DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask1","root","Manoj123");
		Statement stt = con1.createStatement();
		ResultSet rss= stt.executeQuery("select * from Studentdata");

		System.out.println("Select the option");
		System.out.println("1--> insert the student data");
		System.out.println("2--> update the update data");
		System.out.println("3--> delete the studentdata");
		System.out.println("4--> view the studentdata");
		System.out.println("5--> mainmenu");


		int sel = sc.nextInt();




		switch(sel) {	

		case 1:
			PreparedStatement ps= con1.prepareStatement("insert into Studentdata values(?,?,?,?,?,?)");
			ps.setInt(1, 2);
			ps.setInt(2, 220501);
			ps.setString(3, "sabari");
			ps.setString(4, "ece");
			ps.setInt(5, 2015);
			ps.setString(6, "Firstclass");

			int a=	ps.executeUpdate();
			operations();

			break;

		case 2:

			PreparedStatement ps2 = con1.prepareStatement("update Studentdata set dept=? where name=?");


			System.out.println("enter the dept to change"); 
			String d = sc.next();
			ps2.setString(1, d);

			System.out.println("enter the  student name to change dept");
			String d1 = sc.next();


			ps2.setString(2, d1);
			ps2.executeUpdate();
			operations();

			break;


		case 3:

			PreparedStatement ps3 = con1.prepareStatement(" delete from Studentdata where name=?");

			System.out.println("enter the  student name to delete"); String d3 =
					sc.next();

			ps3.setString(1, d3);

			ps3.executeUpdate();
			operations();

		case 4:

			while(rss.next()) {


				System.out.println(rss.getString(1)+" "+rss.getString(2)+" "+rss.getString(3)+" "+rss.getString(4)+" "+rss.getInt(5)+ "   "+rss.getString(6));

			}

			operations();
			
		break;
		
		
		case 5:
			
			mainmenu();
		}
	}


	static  void  useroperations() throws SQLException {

		Scanner sc = new Scanner(System.in);

		Connection con1  =DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask1","root","Manoj123");
		Statement stt = con1.createStatement();
		ResultSet rss= stt.executeQuery("select * from Studentdata");


		System.out.println("Select the option");
		System.out.println("1--> view the student data");
		System.out.println("2--> maimenu");


		int us = sc.nextInt();

		switch(us) {

		case 1:


			while(rss.next()) {


				System.out.println(rss.getString(1)+" "+rss.getString(2)+" "+rss.getString(3)+" "+rss.getString(4)+" "+rss.getInt(5)+ "   "+rss.getString(6));

			}
			
			useroperations();

			break; 	 

		case 2: 
		
		mainmenu();
		
		}

	}
   static void mainmenu() throws SQLException {	
	Scanner sc = new Scanner(System.in);

	System.out.println("WELCOME");
	System.out.println("1-->ADMIN");
	System.out.println("2-->USER");

	int ad = sc.nextInt();

	switch(ad) {

	case 1:

		Studentdatabase.operations();

		break;
	case 2:

		useroperations();
		break;
	}
	
	
   }
	
	
	

	public static void main(String[] args) throws SQLException {

		mainmenu();
	}

}
