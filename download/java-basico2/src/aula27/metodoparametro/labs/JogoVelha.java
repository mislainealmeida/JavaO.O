package aula27.metodoparametro.labs;

public class JogoVelha {

	char[][] jogoVelha = new char[3][3];
	int jogada;
	
		boolean validarJogada(int linha, int coluna, char sinal){
			
			if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente novamente");
				return false;
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
				return true;
			}		
	}
		void imprimirTabuleiro() {
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");

				}
				System.out.println();
		}
}
		boolean verificarGanhador(char sinal) {
			if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || // linha 1
					(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || // linha 1
					(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || // linha 1
					(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || // coluna1
					(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || // coluna2
					(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || // coluna 3
					(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)) { // diagonal
				
				return true;

			} 
			return false;
			
	}
		boolean vezJogador2() {
			if(jogada % 2== 1) {
				return true;
			}
			return false;
		}
}
