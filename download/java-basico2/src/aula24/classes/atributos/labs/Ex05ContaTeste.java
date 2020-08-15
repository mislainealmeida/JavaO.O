package aula24.classes.atributos.labs;

public class Ex05ContaTeste {

	public static void main(String[] args) {
		Ex05Conta conta = new Ex05Conta(); 
		
		conta.numero= "5848-1";
		conta.saldo= 200.0;
		conta.especial= true;
		conta.limite= 1000.0;
		
		System.out.println("***Conta Corrente***");
		System.out.println("Número: "+conta.numero);
		System.out.println("Saldo: R$"+conta.saldo);
		System.out.println("Conta Especial: "+conta.especial);
		System.out.println("Limite: R$"+conta.limite);
		

	}

}
