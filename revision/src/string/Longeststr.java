package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Longeststr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashMap<Character,Integer>map= new LinkedHashMap<>();
		
		
		String str= "abcadabcdefbb";
		
		
		for(int i=0;i<=str.length()-1;i++) {
			
			
			char c = str.charAt(i);
				
				map.put(c, i);
				
		}
		
		for(Entry<Character, Integer> e:map.entrySet()) {
			
			System.out.print(e.getKey());
		}
		
		
	}

}
