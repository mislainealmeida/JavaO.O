package aula27.metodoparametro;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	 void exibirAutonomia() {
		 
		 System.out.println("A autonomia do carro �: "+ capCombustivel * consumoCombustivel + "km");
		
	 }
	 
	 double obterAutonomia() {
		 System.out.println ("M�todo ObterAutonomia foi chamado");
		 
		 return capCombustivel * consumoCombustivel;
	 }
	 
	 double calcularCombustivel(double km) {
		 
		double qtdCombustivel =  km/consumoCombustivel;
		 return  km/consumoCombustivel;
	 }
}
