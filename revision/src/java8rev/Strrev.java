package java8rev;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Strrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String s = "java concept of the day";
		  
		  
		  
		  String[] s2 =s.split(" ");
		  
		  
		  List<String>ll1=Arrays.asList(s2);
		  
		  ll1.stream().map(m-> new StringBuilder(m).reverse()).forEach(e->System.out.print(e));
		 
		
		
		
		System.out.println();
		
		List<String> ll= Arrays.asList("one","2wo","3hree","four","5ive");
		
	
		
	      ll.stream().filter(t->t.charAt(0)=='0'||t.charAt(0)=='1'||t.charAt(0)=='2'||t.charAt(0)=='3'||t.charAt(0)=='4'||t.charAt(0)=='5'||t.charAt(0)=='6'||t.charAt(0)=='7'||t.charAt(0)=='8'||t.charAt(0)=='9').forEach(w->System.out.println(w));
	
	System.out.println();
	
	
	
	     //** start with '1' **//
	
	           List<Integer> il = Arrays.asList(10,21,45,78,15,30);
	
	         il.stream().filter(q->q.toString().charAt(0)=='1').forEach(r->System.out.println(r));
	           System.out.println();
	           
	           
 
         //** descending order**//
	
          System.out.println(il.stream().sorted().collect(Collectors.toList()));

	
	
               //** twice a number = true **//
  
                 List<Integer> pp = Arrays.asList(1,2,3,1);
  
 
  pp.stream().filter(k->k.toString().equals("1")).forEach(qq->System.out.println(qq));
  
  
  
   
 
 
  List<String> ss=  Arrays.asList("aa","bb","cc","aa");
  
 //ss.stream().map(xx->xx.chars())

  
  
	}

}
