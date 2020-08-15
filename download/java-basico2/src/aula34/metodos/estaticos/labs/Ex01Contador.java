package aula34.metodos.estaticos.labs;

public class Ex01Contador {

	private static int cont=1;

	public static void incrementar() {
		cont ++;
	}
	public static void zerar() {
		cont=0;
	}
	public static int obterValor() {
		return cont; 
	}
}
