package aula35.recursividade;

public class Fatorial {
	//fatorial (5)= 5*fatorial (4)
	//fatorial (4)= 4*fatorial (3)
	//fatorial (3)= 3*fatorial (2)
	//fatorial (2)= 2*fatorial (1)
	//fatorial (1)= 1*fatorial (0)
	
	public static int fatorial(int num) {
		if(num==0) {
			return 1; 
		}
		 int total= num* fatorial (num-1);
		 return total;
		
	}
	
	

}
