package aula50.stacktrace.throwss;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {
		System.out.println("Entre com um número decimal");
		
		try{
			double num= lerNumero();
			System.out.println("Você digitou "+ num);
		}catch(Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
		

	}

	public static double lerNumero() throws Exception{
		Scanner scan= new Scanner(System.in);
		double num= scan.nextDouble();
		return num;
	}
}
