package aula43.classe.object.labs;

public class Ex03Mamifero extends Ex03Animal{
	
	private String alimento;

	public Ex03Mamifero() {
		super();
		this.setAmbiente("Terra");
		this.setCor("Castanho");
	}


	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return  "Mamífero \n" +
				"Nome =" + getNome() + "\n"
				+ "Alimento=" + alimento  + "\n"
				+ "Comprimento=" + getComprimento() + "\n" 
				+ "Pata=" + getPata() +  "\n"
				+ "Cor=" + getCor() + "\n"
				+  "Ambiente="+ getAmbiente() + "\n"
				+ "Velocidad=" + getVelocidade() + "]";
	}

	
	
	

}
