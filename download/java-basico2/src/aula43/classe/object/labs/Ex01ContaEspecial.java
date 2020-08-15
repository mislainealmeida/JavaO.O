package aula43.classe.object.labs;

public class Ex01ContaEspecial extends Ex01ContaBancaria{
	private double limite;

	public Ex01ContaEspecial() {
	}

	public Ex01ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	double novoSaldo= this.getSaldo();
	@Override
	public double sacar(double valorS) {
		System.out.println("Saque : R$"+valorS);
		novoSaldo = this.getSaldo() - valorS;
		
		
		if (novoSaldo < 0) {
			System.out.println("Saldo insuficiente, usando o limite ");
			double limiteRestante= limite + novoSaldo; 
			System.out.println("Limite Restante: R$ "+limiteRestante);
		} else {
			System.out.println("Saldo efetuado ");
			System.out.println("Novo saldo: R$" + novoSaldo);
		}
		return novoSaldo;
	}

	@Override
	public double depositar(double valorD) {
		novoSaldo = novoSaldo + valorD;
		System.out.println("Depósito : R$"+valorD);
		System.out.println("Novo saldo: R$" + novoSaldo);
		return novoSaldo;

	}

}
