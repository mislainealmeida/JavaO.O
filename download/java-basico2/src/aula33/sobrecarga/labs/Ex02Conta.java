package aula33.sobrecarga.labs;

public class Ex02Conta {
	private String numero;
	private double saldo;
	private boolean especial;
	private double limite;
	private double valorEspecialUsado;
	
	public Ex02Conta() {}

	public Ex02Conta(String numero, double saldo, boolean especial, double limite, double valorEspecialUsado) {
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}
	
	public double sacar(double valor) {
		double saldoSacar = saldo;
		System.out.println("Sacar " + valor);
		if (valor <= saldo) {
			saldoSacar = saldo - valor;
		} else {
			if (especial == true && saldo> -500) {
				System.out.println("Saldo insuficiente, usando o cheque especial");
				saldoSacar = saldo - valor;			

				
			} else {
				System.out.println("Saldo insuficiente");
			}
		}
		System.out.println("Novo Saldo é " + saldoSacar);
		return saldo = saldoSacar;

	}

	public double depositar(double valor) {
		System.out.println("Depositar " + valor);
		double saldoDepositar = saldo + valor;
		System.out.println("Novo Saldo é " + saldoDepositar);
		return saldo = saldoDepositar;
	}

	public double usarEspecial() {
		double novoEspecial = 0;
		if (saldo <= 0 && especial == true) {
			novoEspecial = saldo + limite;
			System.out.println("Novo limite: R$ " + novoEspecial);

		}
		return novoEspecial;
	

}
}
