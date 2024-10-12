package collectionstask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

class Admin extends Exception {

	Admin(String value){
		super(value);
	}

	static  Map<Integer, String> adm=new ConcurrentHashMap<Integer,String>();
	static void admin() throws Admin {


		Scanner sc = new Scanner (System.in);

		System.out.println("Enter your password");


		String ps = sc.next();

		String psw ="3434";


		if(psw.equals(ps)) {

			adminop();
		}
		else {


			throw new Admin("Please enter correct pswd");
		}

	}

	static  void adminop() throws Admin {
		Scanner sc = new Scanner (System.in);
		ArrayList hh=new ArrayList();



		System.out.println("1--> Add librarian");

		System.out.println("2-->view");

		System.out.println("3--> delete");

		System.out.println("4--> main menu");


		int ob1= sc.nextInt();


		switch(ob1) {

		case 1: 
			System.out.println("enter the id to add");
			int id = sc.nextInt();
			System.out.println("enter the name to add");
			String name= sc.next();

			adm.put(id, name);

			adminop();
			break;
		case 2:

			System.out.println(adm);
			adminop();
			break;

		case 3:

			System.out.println("enter the id to remove");

			int del = sc.nextInt();

			if (adm.containsKey(del)) {

				hh.add(adm.remove(del));	

			} 	 
			System.out.println(hh);
			adminop();
			break;

		case 4:

			Mainoperations.mainmenu();

		}

	}    
}

class Librarian{


	static List <String>books= new LinkedList<String>();

	static	 List <String>issued= new LinkedList<String>(); 


	static	void lib() throws Admin {


		Scanner sc= new Scanner(System.in);

		System.out.println("enter your mailid");

		String mail = sc.next();




		if(mail.contains("@gmail")) {

		pwd1();
			
		}
			else {

				System.out.println("please enter correct mail format");
				lib();

			}
		
	}


	     static void pwd1() throws Admin {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the password");
		
		String pswrd = sc.next();
		
	
			for(int i=0;i<=pswrd.length()-1;i++) {
				
		
         if(pswrd.charAt(i)=='~'||pswrd.charAt(i)=='*'||pswrd.charAt(i)=='`'||pswrd.charAt(i)=='!'||pswrd.charAt(i)=='@'||pswrd.charAt(i)=='#'||pswrd.charAt(i)=='$'||pswrd.charAt(i)=='^'||pswrd.charAt(i)=='&'||pswrd.charAt(i)=='('||pswrd.charAt(i)==')'||pswrd.charAt(i)=='_'||pswrd.charAt(i)=='-'||pswrd.charAt(i)=='+'||pswrd.charAt(i)=='='){
						 

						libob();

					}
					

				}
			

		}
		
	static void  libob() throws Admin {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1--> Add books");

		System.out.println("2-->view books");

		System.out.println("3--> delete issue books");

		System.out.println("4--> view issued books");
		System.out.println("5--> main menu");


		int libr = sc.nextInt();


		switch(libr) {

		case 1:

			System.out.println("add books");

			String bk = sc.next();


			books.add(bk);

			libob();
			break;


		case 2:

			System.out.println(books);
			libob();
			break;

		case 3:
			System.out.println("enter the issued boook to delete");
			String rem = sc.next();



			for(int i=0;i<=books.size()-1;i++) {

				if(books.get(i).equalsIgnoreCase(rem)) {


					books.remove(books.get(i));

					issued.add(rem);

				}


			}

			libob();
			break;
			
		case 4:

			System.out.println(issued);

			libob();
			break;

		case 5:

			Mainoperations.mainmenu();
		}   
	}

}

     class Mainoperations {
    	 
	  static  void mainmenu() throws Admin {

		Scanner sc = new Scanner (System.in);
		System.out.println("LIBRARY");

		System.out.println("1--> ADMIN");


		System.out.println("2-->LIBRARIAN");


		int ob= sc.nextInt();

		switch(ob) {

		case 1:

			try {
				Admin.admin();
			} 

			catch (Admin e) {

				System.out.println("re-enter the pswd");
				Admin.admin(); 
			}
			break;

		case 2:

			Librarian.lib();
			break;
		}

	}
}


public class Libraryadmin {

	public static void main(String[] args) throws Admin {
		// TODO Auto-generated method stub

		Mainoperations.mainmenu();


	}

}
