package aula34.metodos.estaticos;


public class MinhaCalculadoraTeste {

	static int resultSoma;
	
	public static void main(String[] args) {
		
				
		//sem instancia, nao tem acesso ao m�todo, precisa do static

		resultSoma= MinhaCalculadora.soma(2, 3);
		MinhaCalculadora.soma(1, 2);
		MinhaCalculadora.soma(1.0, 2.0);
		soma2Valores(1, 2);
		
	}
	//se o m�todo n�o fosse static eu nao conseguiria acessa lo. 
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
