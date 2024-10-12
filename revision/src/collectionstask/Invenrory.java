package collectionstask;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Invenrory {

	 static Map<String ,Integer> Stocks = new HashMap<String ,Integer>();
	
	
	
void purcahse()	{
	
	
	Scanner sc = new Scanner(System.in);
	
	Stocks.put("drivers", 2);		
	Stocks.put("panels", 4);
	Stocks.put("display", 2);
	Stocks.put("motherboard", 2);
	
	System.out.println(Stocks);
	


	
	
	String status ="received";
	
	
	
		
		
	System.out.println("purcahsed item :");
	String purc = sc.next();
	
	System.out.println("no of quantity :");
	int qty = sc.nextInt();
	
	System.out.println("Status");
	
	String rcs = sc.next();
	
	if(status.equalsIgnoreCase(rcs))
		
	for(Entry<String, Integer> p:Stocks.entrySet()) {
		
		if(p.getKey().equalsIgnoreCase(purc)) {
			
			
		int c=	p.getValue()+qty;
		
		Stocks.put(purc, c);
			
		}
		
		
	}
	System.out.println(Stocks);
	
	
	
	
	
	
	
	
	
}
	
	
void sales() {
	
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	

	
	
	
	
	String status ="dipatched";
	
	
	
		
		
	System.out.println("dispatched item :");
	String purc = sc.next();
	
	System.out.println("no of quantity :");
	int qty = sc.nextInt();
	
	System.out.println("Status");
	
	String rcs = sc.next();
	
	if(status.equalsIgnoreCase(rcs))
		
	for(Entry<String, Integer> p:Stocks.entrySet()) {
		
		if(p.getKey().equalsIgnoreCase(purc)) {
			
			
		int c=	p.getValue()-qty;
		
		
		
		Stocks.put(purc, c);
			
		}
		
		
	}
	System.out.println(Stocks);
	
	
}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1-->purchase 2--> sales :");
	    int option  = sc.nextInt();
	    
	    
		Invenrory ref = new Invenrory();

		switch(option) {
		case 1 :
		
		ref.purcahse();
		
		case 2:
			
		ref.sales();
		
		}
		
	
	}

}
