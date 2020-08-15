package aula35.recursividade.labs;

public class Ex01Fibonacci {

	//0+1=1   1+1= 2   1+2=3   2+3=5   5+3=8   8+5=13   13+8=21
	//0,1,2,3,5,8,13,21
	public static int fibonacci(int num) {
		if(num<2) {
			return 1;
		}
		return fibonacci (num-1) + fibonacci (num-2);
			
}
}
