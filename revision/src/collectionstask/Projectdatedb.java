package collectionstask;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


class Projectname{
	
	
	String tasks;
    Date sdate ;
	Date edate;

	public Projectname( String tasks,Date sdate, Date edate) {
		
		
		this.tasks = tasks;
		this.sdate = sdate;
		this.edate = edate;
	}
	
	
	public String toString() {
		return "Projectname [ tasks=" + tasks + ", sdate=" + sdate + ", edate=" + edate + "]";
	}
	 
	
   //@SuppressWarnings("deprecation")
static 	void projectoperatioms() throws SQLException, ParseException {
		
	   Scanner sc= new Scanner(System.in);
	   
	   SimpleDateFormat sd= new  SimpleDateFormat("yyyy-MM-dd");
	   java.util.Date date1 = sd.parse("2024-06-23");
	   String formattedDate = sd.format(date1);
	   
      
       
       System.out.println(date1);
	   
	   
	   
		Map<String,Projectname> proj = new HashMap<String,Projectname>(); 
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask1","root","Manoj123");
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select * from project1");
		
		
		while(rs.next()) {


			proj.put(rs.getString(1), new Projectname(rs.getString(2),rs.getDate(3),rs.getDate(4)));

		}
		

		System.out.println(proj);
		
		
		
		for(Entry<String,Projectname> pr:proj.entrySet()) {

		if(pr.getValue().edate.before(date1)) {

				System.out.println(pr.getKey()+"     "+pr.getValue().tasks+ "    " +"This project was overdue ");
		
			}
		
		
		
	}
		
}
}

public class Projectdatedb {
	
	public static void main(String[] args) throws SQLException, ParseException {
	
	
		
		Projectname. projectoperatioms();
	
	}
	

}
