package aula33.sobrecarga;

public class MinhaCalculadoraTeste {

	public static void main(String[] args) {
	
		MinhaCalculadora calc= new MinhaCalculadora();
		calc.soma(1,2);
		calc.soma(1.0, 2.0);
		
		//Pode ter sobrecarga de métodos ou de construtores.

	}

}
