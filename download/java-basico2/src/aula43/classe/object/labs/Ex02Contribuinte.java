package aula43.classe.object.labs;

public abstract class Ex02Contribuinte {
	
	private String nome; 
	private double rendaBruta;
	
	public Ex02Contribuinte() {
		super();
	
	}
	public Ex02Contribuinte( String nome, double rendaBruta) {
		super();
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta= rendaBruta;
	} 
	
	public abstract double calcularImposto();
	
	

}
