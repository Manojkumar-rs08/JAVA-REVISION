package exception;


public class Npowerexception extends Exception  {


	Npowerexception (String value){

		super(value);
	}

	static long  power (int a, int b) throws Npowerexception  {
		
		long ll;

		if(a==0&&b==0) {

			throw  new Npowerexception (" a and p should not be zero");

		}

		else if(a<0||b<0) {


			throw new Npowerexception (" a or  b should not be negative");
		}

		else {


		ll = (long) Math.pow(a, b);
			
			return ll;
		}


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
		System.out.println(Npowerexception.power(10,3));
		} 
		
		catch (Npowerexception e) {
			
			e.printStackTrace();
		}
		


	}

}
