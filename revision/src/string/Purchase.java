package string;

import java.util.ArrayList;
import java.util.Scanner;

class groceryshop{
	
	String vegname;
	Integer price;
	
	
	public groceryshop(String vegname, Integer price) {
		super();
		this.vegname = vegname;
		this.price = price;
	}


	@Override
	public String toString() {
		return "groceryshop [vegname=" + vegname + ", price=" + price + "]";
	}
	
	
	
	
}


class Customer{
	
	String cveg;
	int kg;
	public Customer(String cveg, int kg) {
		super();
		this.cveg = cveg;
		this.kg = kg;
	}
	@Override
	public String toString() {
		return "Customer [cveg=" + cveg + ", kg=" + kg + "]";
	}
	
}

public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in)	;

		
		ArrayList<groceryshop>pur = new ArrayList<groceryshop>();
		
		ArrayList<Customer>cus = new ArrayList<Customer>();
		
		
		int coun =3;
		while(coun>0) {
			
			
			System.out.println("veg name");
			String veg = sc.next();
			
			
			System.out.println("How many kg?");
			int kg = sc.nextInt();
		cus.add(new Customer(veg,kg));
		coun--;
		}
		
		
		pur.add(new groceryshop("beetroot",100));
		
		pur.add(new groceryshop("carrot",70));
		
		pur.add(new groceryshop("tomato",80));
		
		pur.add(new groceryshop("onion",100));
		
		pur.add(new groceryshop("beans",180));
		
	
		
		for(groceryshop d:pur) {
			for(Customer c:cus) {
			
			if(d.vegname.equalsIgnoreCase(c.cveg)) {
				
				System.out.println(d+ "" +d.price*c.kg);
			}
				
			}
			
		}
				
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
/*
 * Scanner sc = new Scanner(System.in) ;
 * System.out.println("carrot howmany kg"); int carrot = 150; int a=
 * sc.nextInt(); int cb =carrot*a;
 * 
 * 
 * 
 * 
 * 
 * System.out.println("chilli howmany kg");
 * 
 * int chilli = 100;
 * 
 * int b= sc.nextInt(); int cc =chilli*b;
 * 
 * 
 * 
 * System.out.println("beetroot howmany kg");
 * 
 * int beetroot = 70;
 * 
 * int c= sc.nextInt(); int bb=beetroot*c;
 * 
 * 
 * 
 * int total = cb+cc+bb;
 * 
 * System.out.println("carrot  "+ a +" kg = "+cb);
 * 
 * System.out.println("chilli "+b +" kg = "+cc );
 * System.out.println("beetroot "+c +" kg = "+bb);
 * System.out.println("TOATL  ="+ total);
 * 
 * 
 * }
 * 
 * }
 */