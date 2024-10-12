package collectionstask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class tkt {
	
	String title;
	String desc;
	String priorty;
	String status;
	
	tkt(String title,String desc, String Priorty,String status){
		
		this.title= title;
		this.desc = desc;
		this.priorty=Priorty;
		this.status= status;
		
	}


	public String toString() {
		return "tkt [title=" + title + ", desc=" + desc + ", priorty=" + priorty + ", status=" + status + "]";
	}


 static void  tkkoprtns() throws SQLException {
		
		List<tkt> tkk = new ArrayList<>();

		    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask1","root","Manoj123");
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("select * from ticket");
		
		while(rs.next()) {
			
			tkk.add(new tkt (rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
					
		}
		
		
		System.out.println(tkk);
		
	}	
 	
}


public class Ticketsys {

	public static void main(String[] args) throws SQLException {
		

		
		
		tkt.tkkoprtns();

	}

}
