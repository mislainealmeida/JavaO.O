package aula31.modificadores.publicprivate;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		 
		 System.out.println("A autonomia do carro �: "+ this.capCombustivel * this.consumoCombustivel + "km");
		
	 }
	 
	 double obterAutonomia() {
		 System.out.println ("M�todo ObterAutonomia foi chamado");
		 
		 return this.capCombustivel * this.consumoCombustivel;
	 }
	 
	 double calcularCombustivel(double km) {
		 
		double qtdCombustivel =  km/this.consumoCombustivel;
		 return  qtdCombustivel;
	 }


}
