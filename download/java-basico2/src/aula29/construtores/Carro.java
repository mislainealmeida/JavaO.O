package aula29.construtores;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro(){
		System.out.println("Classe Carro foi instanciada");
	}
	
	 void exibirAutonomia() {
		 
		 System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + "km");
		
	 }
	 
	 double obterAutonomia() {
		 System.out.println ("Método ObterAutonomia foi chamado");
		 
		 return capCombustivel * consumoCombustivel;
	 }
	 
	 double calcularCombustivel(double km) {
		 
		double qtdCombustivel =  km/consumoCombustivel;
		 return  km/consumoCombustivel;
	 }

}
