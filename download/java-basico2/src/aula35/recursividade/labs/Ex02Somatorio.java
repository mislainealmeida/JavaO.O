package aula35.recursividade.labs;

public class Ex02Somatorio {

	public static double soma(double num) {
		if(num==1) {
			return 1; 
		}
		 double resultado= num + soma(num-1);
		 return resultado;
						
		}
	}

