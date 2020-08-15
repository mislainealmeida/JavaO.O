package aula43.classe.object.labs;

public class Ex01ContaPoupanca extends Ex01ContaBancaria{
	
	private double taxaRendimento;
	

	public Ex01ContaPoupanca() {}

	public Ex01ContaPoupanca(double taxaRendimento) {
		super();
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	
	double novoSaldo= this.getSaldo();
	public double calcularRendimento() {
		novoSaldo = this.getSaldo() + ((this.taxaRendimento*super.getSaldo()));
		System.out.println("Novo saldo: R$" +novoSaldo);
		return novoSaldo;
	}

	
	@Override
	public double sacar(double valorS) {
		System.out.println("Saque: R$"+ valorS);
		novoSaldo= novoSaldo - valorS; 
			if (novoSaldo<0) {
				System.out.println("Saque indisponível ");
				novoSaldo= novoSaldo; 
			}else {
				System.out.println("Saldo efetuado "); 
				System.out.println("Novo saldo: R$" +novoSaldo);
			}return novoSaldo;
		}
		
	@Override
	public double depositar(double valorD) {
		System.out.println("Depósito: R$"+ valorD);
		novoSaldo= novoSaldo + valorD;
			System.out.println("Novo saldo: R$" +novoSaldo);
			return novoSaldo;					
		}

	}


