package aula47.exceptions;

public class Teste {

	public static void main(String[] args) {
		
		try {// tente
			int[] vetor= new int [4];
			System.out.println("Antes da exception");
			
			vetor[4]= 1;
			
			System.out.println("Esse texto n�o ser� impresso");

		} catch(ArrayIndexOutOfBoundsException excecption){ // caso ocorra um erro capture a exce��o e trate o erro
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe");
		}
		System.out.println("Esse texto ser� impresso ap�s a exception");
	}
}
		

