package aula34.metodos.estaticos.labs;

public class Ex01ContadorTeste {
	
	public static void imprimirValor() {
		System.out.println(Ex01Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		Ex01Contador.incrementar();
		imprimirValor();
		Ex01Contador.zerar();
		imprimirValor();
		Ex01Contador.incrementar();
		Ex01Contador.incrementar();
		Ex01Contador.incrementar();
		Ex01Contador.incrementar();
		imprimirValor();
		
		//atributo static nao mudar o valor, nao tem como setar um valor para cada instancia
		//mesmo instanciando o valor continua o mesmo. 
	}
}
