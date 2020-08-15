package aula27.metodoparametro.labs;

import java.util.Scanner;

public class JogoVelhaTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		JogoVelha jogo = new JogoVelha();
		
		System.out.println("Jogador 1 = O");
		System.out.println("Jogador 2 = X");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while (!ganhou) {
			if (jogo.vezJogador2()) {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'O';

			}
		
		linha= valor ("Linha ", scan);
		coluna=valor("Coluna", scan);
		jogo.validarJogada(linha, coluna, sinal);
		jogo.imprimirTabuleiro();
		
		
		if(jogo.verificarGanhador('X')) {
			ganhou = true;
			System.out.println("Parabéns, jogador 2 ganhou");

		}else if(jogo.verificarGanhador('O')) {
			ganhou = true;
			System.out.println("Parabéns, jogador 1 ganhou");

		}else if (jogo.jogada>9){
			ganhou= true;
			System.out.println("Ninguém ganhou");
		}
			
		}
	}
		static int valor(String tipoValor, Scanner scan) {
			int valor=0;
			boolean valorValido = false;
			while (!valorValido) {
				System.out.println("Entre com "+tipoValor+ " 1,2 ou 3");
				valor = scan.nextInt();
				if (valor >= 1 && valor <= 3) {
					valorValido = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			
				
		}
			valor--;
			return valor;
		}
				
}

