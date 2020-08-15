package aula25.metodosimples;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	 void exibirAutonomia() {
		 
		 System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + "km");
	 }

}
