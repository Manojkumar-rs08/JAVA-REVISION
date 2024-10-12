package collectionstask;

import java.sql.*;
import java.util.*;
import java.util.Map.Entry;


class Instute{



	String sname;
	String course;



	public Instute( String sname,  String course) {


		this.sname = sname;
		this.course=course;
	}


	public String toString() {
		return "Instute [ sname=" + sname + ", course=" + course + "]";
	}


	static  void insitute () throws SQLException {

		Scanner sc= new Scanner(System.in);


		Map<Integer, Instute> stu = new HashMap<Integer, Instute>();

		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tabletask1","root","Manoj123");
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select * from Studentcourse");


		while(rs.next()) {


			stu.put(rs.getInt(3), new Instute(rs.getString(2),rs.getString(1)));

		}


           System.out.println("enter the course");
           String ss= sc.next();
           
		for(Entry<Integer, Instute> course:stu.entrySet()) {

			if(course.getValue().course.equalsIgnoreCase(ss)){

				System.out.println(course);


			}

		}   
	}
}


public class Studentcoursedb {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub	
		Instute.insitute();

	}

}
