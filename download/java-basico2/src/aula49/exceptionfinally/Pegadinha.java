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
				System.exit(0);// termina a execução do programa.
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Faltando denominador");
				System.exit(0);// ao terminar execução do programa dentro do try ou catch, finally NAO é executado
			}
			finally {
				System.out.println("Essa linha é impressa sempre após o try e catch");
				System.out.println();
			}

		}

	}

	}
