package javafirst;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=20;
		
		int c=0;
		for(int i=1; i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
			
			
			 if((i*i)+(j*j)==n) {
			
			System.out.println(i+" ,"+j);
			
		c=1;
		
		return; 
			 }
			 
	
			}
			
		}
		
		if(c==0) {
			
			System.out.println("not square");
		}
    
	}

}
