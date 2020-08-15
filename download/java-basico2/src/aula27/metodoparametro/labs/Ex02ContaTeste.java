package aula27.metodoparametro.labs;

public class Ex02ContaTeste {

	public static void main(String[] args) {
		
		Ex02Conta conta= new Ex02Conta();
		
		conta.numero= "5848-1";
		conta.saldo=100.0;
		conta.limite = 500;
		conta.especial= true;
		
		System.out.println("Conta Corrente");

		System.out.println("Número: "+conta.numero);
		System.out.println("Saldo:R$ "+conta.saldo);
		System.out.println("Limite:R$ "+conta.limite);
		System.out.println("Especial: "+conta.especial);
		
		
		conta.sacar(500);
		conta.depositar(20);
		conta.usarEspecial();
		
		
		
		

	
	}

}
