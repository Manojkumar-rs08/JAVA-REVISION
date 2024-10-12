package collectionstask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Studentdetails{
	
	
	String name;

	String name1;
	
	String name2;

	String name3;

	String name4;
	
	
	 Studentdetails(String name,String name1, String name2,String name3,String name4)
	 {	
		 
		this.name= name;
	
		this.name1= name1;
	
		this.name2= name2;

		this.name3= name3;
		
		this.name4= name4;

		
	 }
	
	public String toString() {
		
		
		return name+" "+name1+ " "+name2+ " "+name3+ " "+name4;
	}
}



public class Studentcourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
	
		HashMap<String,Studentdetails> hh = new HashMap<String,Studentdetails>();
		
		hh.put("java" ,new Studentdetails("obeth","sabari","vj","kren","man"));
		hh.put("python",new Studentdetails("sbari","vj","jk","stev","kr"));
	
		
		//System.out.println(hh.get("java"));
		
		System.out.println("enter the course");
		
		String cc = sc.next();
		
		System.out.println(hh.get(cc));
		
		
	}
}
