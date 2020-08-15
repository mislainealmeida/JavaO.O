package aula43.classe.object.labs;

public  class Ex03Animal {
	
	
	private String nome;
	private double comprimento; 
	private int pata;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	
	public Ex03Animal() {
		this.pata=4;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPata() {
		return pata;
	}
	public void setPata(int pata) {
		this.pata = pata;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return  "Animal \n" +
				"Nome =" + getNome() + "\n"
				+ "Comprimento=" + getComprimento() + "\n" 
				+ "Pata=" + getPata() +  "\n"
				+ "Cor=" + getCor() + "\n"
				+  "Ambiente="+ getAmbiente() + "\n"
				+ "Velocidad=" + getVelocidade() + "]";
	}

	

}
