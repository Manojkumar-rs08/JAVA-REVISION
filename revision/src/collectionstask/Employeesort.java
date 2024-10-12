package collectionstask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employeesort implements Comparable< Employeesort> {
	
	String name;
     int id;
     int sal;
	public Employeesort(String name, int id, int sal) {
  
	this.name = name;
	this.id = id;
	this.sal = sal;
	}
	
	
	
	
	public String toString() {
		return "Employeesort [name=" + name + ", id=" + id + ", sal=" + sal + "]";
		
		
	}




	public int compareTo( Employeesort o) {
		// TODO Auto-generated method stub
		
	int c =o.name.compareTo(name);
		return -c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employeesort>ll= new ArrayList<>();
		
		ll.add(new Employeesort("obeth",101,5000));
		ll.add(new Employeesort("sabari",102,5000));
		ll.add(new Employeesort("kiran",103,5000));
		ll.add(new Employeesort("man",104,5000));
		
		 
		Collections.sort(ll);
		System.out.println(ll);
		
		
		
		
	}










	
}
