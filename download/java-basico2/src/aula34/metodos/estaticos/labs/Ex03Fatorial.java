package aula34.metodos.estaticos.labs;

public class Ex03Fatorial {
	//5!= 5*4*3*2*1=120
		public static int fatorial (int num) {
			if(num==0) {
				return 1;
			}else {
				int total=1;
				for(int i=num; i>1; i--) {
					total *=i;
				}
				
				return total;
			}
			
		}

}
