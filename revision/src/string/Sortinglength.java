package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortinglength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>name = Arrays.asList("ALice","Alice","Bob","charlie","Andrew","david"); 
		
	System.out.println(	name.stream().collect(Collectors.groupingBy(l->l.length())));
		
		
	List<String>num1=  Arrays.asList("abcabcbb");
	
	num1.stream().distinct().forEach(e->System.out.println(e));
}
}