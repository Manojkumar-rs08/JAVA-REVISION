package string;

public class Stringparanthesis {

	public static void main(String[] args) {


		 String count="";


		String s1="(()()())";
		

		String[] s2 = s1.split("");

		for(int i=0;i<s2.length;i++) {

			if(s2[i].equals("(")&&s2[i+1].equals(")"))
			{

				count+=s2[i]+s2[i+1];
			}
		}

	
			
		System.out.println(count.length());		
}
}