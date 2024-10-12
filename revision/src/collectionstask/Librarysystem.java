package collectionstask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Bookdetails{

	String author;
	String bookname;
	int noofcopies;

	Bookdetails( String author,String bookname,int noofcopies)
	{
		this.author= author;
		this.bookname= bookname;
		this.noofcopies = noofcopies;	
	}




	public String toString() {

		return  author+" "+bookname+" "+noofcopies;
	}	
}

public class Librarysystem implements Comparator<Bookdetails> {


	public int compare(Bookdetails o1, Bookdetails o2) {

		if (o1.noofcopies<o2.noofcopies)
			return -1;
		if (o1.noofcopies>o2.noofcopies)
			return 1;

		return 0;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Bookdetails>bk= new ArrayList<Bookdetails>();



		bk.add(new Bookdetails("gandhi","sathyasothanai",5));

		bk.add(new Bookdetails("nehru","political science",3));
		bk.add(new Bookdetails("vairamuthu","kallikattu ithikasam",4));
		bk.add(new Bookdetails("vairamuthu","thanneer desam",8));
		bk.add(new Bookdetails("gopi","ner ner thema",2));

		Collections.sort(bk,new Librarysystem());

		System.out.println(bk);

		System.out.println("enter the author");

		String check= sc.next();

		for(Bookdetails aa:bk) {

			if(aa.author.equalsIgnoreCase(check)) {

				System.out.println(aa.bookname+"  "+aa.noofcopies);
			}


		}

	}

}
