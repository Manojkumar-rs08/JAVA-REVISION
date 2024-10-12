package collectionstask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Bookdetails1{


	String author;
	String bookname;
	int noofcopies;


	public Bookdetails1(String author, String bookname, int noofcopies) {
		super();
		this.author = author;
		this.bookname = bookname;
		this.noofcopies = noofcopies;
	}



	public String toString() {
		return "Bookdetails [author=" + author + ", bookname=" + bookname + ", noofcopies=" + noofcopies + "]";
	}


	static void library() throws SQLException {


		List<Bookdetails1>ll= new ArrayList<Bookdetails1>();

		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask1","root","Manoj123");
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select * from bookdetails");




		while(rs.next()) {
			ll.add(new Bookdetails1(rs.getString(1),rs.getString(2),rs.getInt(3)));
		}

		System.out.println(ll); 


		for(Bookdetails1 m:ll) {

			if(m.author.equals("gandhi")) {

				System.out.println(m.bookname+" "+m.noofcopies);
			}

		}


	}

}

public class Librarysysdatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Bookdetails1.library();





	}

}
