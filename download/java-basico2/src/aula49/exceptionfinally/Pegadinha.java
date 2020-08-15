package aula49.exceptionfinally;

public class Pegadinha {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);// termina a execu��o do programa.
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Faltando denominador");
				System.exit(0);// ao terminar execu��o do programa dentro do try ou catch, finally NAO � executado
			}
			finally {
				System.out.println("Essa linha � impressa sempre ap�s o try e catch");
				System.out.println();
			}

		}

	}

	}
