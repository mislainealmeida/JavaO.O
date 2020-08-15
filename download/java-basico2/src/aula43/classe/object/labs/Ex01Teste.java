package aula43.classe.object.labs;

public class Ex01Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Conta Simples ***");
		
		Ex01ContaBancaria simples = new Ex01ContaBancaria();
		simples.setNomeCliente("Mislaine");
		simples.setNumConta("1234");
		simples.setSaldo(1000);
		
		System.out.println("Nome: "+ simples.getNomeCliente());
		System.out.println("Conta: "+ simples.getNumConta());
		System.out.println("Saldo: R$"+ simples.getSaldo());
		
		simples.sacar(500);
		simples.depositar(200);
		System.out.println();
		System.out.println();
       
		System.out.println("*** Conta Poupança ***");
		
		Ex01ContaPoupanca poup = new Ex01ContaPoupanca();
		poup.setNomeCliente("Eduardo");
		poup.setNumConta("5678");
		poup.setSaldo(1000);
		poup.setTaxaRendimento(0.5);
		
		System.out.println("Nome: "+ poup.getNomeCliente());
		System.out.println("Conta: "+ poup.getNumConta());
		System.out.println("Saldo: R$"+ poup.getSaldo());
		System.out.println("Taxa de rendimento do dia: "+ poup.getTaxaRendimento());
		
		poup.calcularRendimento();
		poup.sacar(500);
		poup.depositar(200);
		 System.out.println();
		 
        System.out.println("*** Conta Especial ***");
		
		Ex01ContaEspecial especial = new Ex01ContaEspecial();
		especial.setNomeCliente("Juliana");
		especial.setNumConta("9123");
		especial.setSaldo(1000);
		especial.setLimite(2000);
		
		System.out.println("Nome: "+ especial.getNomeCliente());
		System.out.println("Conta: "+ especial.getNumConta());
		System.out.println("Saldo: R$"+ especial.getSaldo());
		System.out.println("Limite: R$"+ especial.getLimite());
	
		
		
		especial.sacar(1300);
		especial.depositar(200);
		
		
		

	}

}
