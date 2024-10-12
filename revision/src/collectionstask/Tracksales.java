package collectionstask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Trackdtl{
	
	String timestamp;
	Integer Procductid;
	Integer quantity;
	Integer price;
	
	
	static int prices;
	public Trackdtl(String timestamp, Integer procductid, Integer quantity, Integer price) {
		
		this.timestamp = timestamp;
		Procductid = procductid;
		this.quantity = quantity;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Trackdtl [timestamp=" + timestamp + ", Procductid=" + Procductid + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	
	  static void track() throws SQLException {
		  
		  Scanner sc= new Scanner(System.in);
		  
		  List<Trackdtl>ll= new ArrayList<Trackdtl>();
		
		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask1","root","Manoj123");
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("select * from track");
		
		while(rs.next()) {
			
			ll.add(new Trackdtl(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)));
			
		}
		
		System.out.println(ll);
		
		
		System.out.println("enter days to know the totalrevenue");
		int days = sc.nextInt();
		
		for(Trackdtl mm:ll) {
			
			
			 prices =mm.price++;
			
		}
		
		System.out.println("TOTAL REVENUE OF GIVEN DAY  :"+  "RUPEES  "  +prices*days);
	}
	
	
}


public class Tracksales {

	public static void main(String[] args) throws SQLException {
		
		
		Trackdtl.track();
	

	}

}
