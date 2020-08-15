package aula34.metodos.estaticos.labs;

public class Ex02CalculadoraTeste {
	
	public static void imprimirValor() {
		System.out.println(Ex02Calculadora.obterValor());
	}

	public static void main(String[] args) {
		imprimirValor();
		Ex02Calculadora.somar(1, 2);
		imprimirValor();
		Ex02Calculadora.subtrair(1.5, 2.0);
		imprimirValor();
		Ex02Calculadora.multiplicar(3, 1.5);
		imprimirValor();
		Ex02Calculadora.dividir(10, 2.5);
		imprimirValor();
		Ex02Calculadora.potencia(10, 2);
		imprimirValor();
		
		
		

	}

}
