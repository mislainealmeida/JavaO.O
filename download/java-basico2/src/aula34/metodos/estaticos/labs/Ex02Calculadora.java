package aula34.metodos.estaticos.labs;

public class Ex02Calculadora {

	static double resultado=0;

	public static void somar(double num1, double num2) {
		resultado= num1+ num2;
		
	}

	public static void subtrair(double num1, double num2) {
		resultado= num1- num2;

	}

	public static void multiplicar(double num1, double num2) {
		resultado= num1*num2;

	}

	public static void dividir(double num1, double num2) {
		resultado= num1/num2;

	}
	public static void potencia(double num1, double num2) {
		resultado= Math.pow(num1, num2);
	}
	public static double  obterValor() {
		return resultado; 
	}
	
	}

