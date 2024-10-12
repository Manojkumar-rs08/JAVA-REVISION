package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Charocccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String s = "obetheanest";
		
	int	dcount=1;
	int ecount=0;
		
		for(int i=0;i<s.length()-1;i++) {
			
			for(int j=i+1;j<s.length()-1;j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					
					dcount++;
					//System.out.println(a.);
					
					
				}
				else {
					
					ecount++;
					System.out.println(s.charAt(i)+""+ecount);
				}
				
				
			}
			

		

	
		
	}
		
	}	
		
	}

