package string;

import java.util.Arrays;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] s= {"java", "program" ,"program","program"};
		
		
		for(int i=0;i<s.length;i++) {
			
			
			for(int j=i+1;j<s.length;j++) {
				
			if(s[i]==s[j]) {
				
				
				s[i]=null;
			}
				
				
				
			}
		}
		
		
		System.out.println(Arrays.toString(s));
		
		
		
		String m= "aaabbbbccccdaaa ";
		
		char [] m1 = m.toCharArray();
		
		for(int k=0;k<=m1.length-1;k++) {
			
			for(int l=k+1;l<=m1.length-1;l++) {
				
				if(m1[k]==m1[l]) {
					
					m1[l] =' ';
				}
				
			}
		}
		
		
		System.out.println(Arrays.toString(m1));
		
		
		
		
	}

}
