package aula33.sobrecarga.labs;


public class Ex02ContaTeste {

	public static void main(String[] args) {
         
		Ex02Conta conta= new Ex02Conta();
		
		conta.setNumero("5848-1");
		conta.setSaldo(100.0);
		conta.setLimite(500);
		conta.setEspecial(true);
		
		System.out.println("Conta Corrente");

		System.out.println("Número: "+conta.getNumero());
		System.out.println("Saldo:R$ "+conta.getSaldo());
		System.out.println("Limite:R$ "+conta.getLimite());
		System.out.println("Especial: "+conta.isEspecial());
		
		
		conta.sacar(500);
		conta.depositar(20);
		conta.usarEspecial();

	}

}
