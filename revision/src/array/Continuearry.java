package array;

import java.util.TreeMap;

public class Continuearry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,6,7,8,10,12,14,15,16,18,19,20,21,22,23};
		
	TreeMap<Integer,Integer>map= new TreeMap<>();
	
		for(int i=0;i<=a.length-1;i++) {
		
			
			if(a[i]-a[i+1]==-1) {
				
				
				
			
					
					System.out.println(a[i]+"-"+a[i+1]);
				
				
				
			}
			
			else {
				
				System.out.println(a[i]);
			}
			
			
		
		
		}
		
	}

}
