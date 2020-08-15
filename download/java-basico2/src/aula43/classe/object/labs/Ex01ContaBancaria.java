package aula43.classe.object.labs;

public class Ex01ContaBancaria {
	
	private String nomeCliente; 
	private String numConta;
	private double saldo;
	
	public Ex01ContaBancaria() {}
	
	public Ex01ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 
	
	double novoSaldo= saldo; 
	public double sacar(double valorS) {
		System.out.println("Saque: R$"+ valorS);
		 novoSaldo= saldo - valorS; 
			if (novoSaldo<0) {
				System.out.println("Saque indisponível ");
				novoSaldo= novoSaldo; 
			}else {
				System.out.println("Saldo efetuado "); 
				System.out.println("Novo saldo: R$" +novoSaldo);
			}return novoSaldo;
		}
		
	
	public double depositar(double valorD) {
		System.out.println("Depósito: R$"+ valorD);
		novoSaldo= novoSaldo + valorD;
			System.out.println("Novo saldo: R$" +novoSaldo);
			return novoSaldo;					
		}

	
	

}
