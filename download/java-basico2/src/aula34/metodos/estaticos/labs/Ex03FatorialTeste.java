package aula34.metodos.estaticos.labs;

import java.util.Scanner;

public class Ex03FatorialTeste {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);

		int num;
		
		do {
			System.out.println("Entre com um n�mero ");
			num=scan.nextInt();
			
			if(num<0) {
				System.out.println("Entre com um n�mero positivo");
				num=scan.nextInt();
			}
			
			}while(num<=0);
		
		System.out.println(Ex03Fatorial.fatorial(num));

	}

}
