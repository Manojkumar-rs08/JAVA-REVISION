package collectionstask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Player {
	
	String name;
	int score;
	
	Player(String name,int score){
		
		
		this.name= name;
		this.score=score;
		
	}
	
	public String toString() {
		
		return name+""+score;
	}	
}

public class Playerscore implements Comparator<Player>  {

	
		
		public int compare(Player o1, Player o2) {
			
			if(o1.score<o2.score)
			return 1;
			else if(o1.score>o2.score)
				return -1;
		
			
			return o1.name.compareToIgnoreCase(o2.name);
			
			
		}	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		
		Player pp[]= {new Player("obeth",120),new Player("sabri",100),new Player("sulai",200),new Player("vijay",120)};
				
	Arrays.toString(pp);	
  
	Arrays.sort(pp,new Playerscore());
	
	System.out.println(Arrays.toString(pp));
		
	}

	
	

	}


