package aula26.metodoretorno;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	 void exibirAutonomia() {
		 
		 System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + "km");
		
	 }
	 double obterAutonomia() {
		 System.out.println ("Método ObterAutonomia foi chamado");
		 
		 return capCombustivel * consumoCombustivel;
	 }

}
