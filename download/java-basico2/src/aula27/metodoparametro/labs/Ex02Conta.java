package aula27.metodoparametro.labs;

public class Ex02Conta {

	String numero;
	double saldo;
	boolean especial;
	double limite;
	double valorEspecialUsado;

	double sacar(double valor) {
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

	double depositar(double valor) {
		System.out.println("Depositar " + valor);
		double saldoDepositar = saldo + valor;
		System.out.println("Novo Saldo é " + saldoDepositar);
		return saldo = saldoDepositar;
	}

	double usarEspecial() {
		double novoEspecial = 0;
		if (saldo <= 0 && especial == true) {
			novoEspecial = saldo + limite;
			System.out.println("Novo limite: R$ " + novoEspecial);

		}
		return novoEspecial;
	}

}
