package aula43.classe.object.labs;

public class Ex03Peixe extends Ex03Animal {

	
	private String caracteristica; 
	
	public Ex03Peixe() {
		super();
		this.setCor("Cinzentada");
		this.setAmbiente("Mar");
		this.caracteristica=  "Barbatanas e caudas"; 
	}
	
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	@Override
	public String toString() {
		return "Peixe \n" +
				"Nome =" + getNome() + "\n"
				+ "Caracteristica=" + caracteristica  + "\n"
				+ "Comprimento=" + getComprimento() + "\n" 
				+ "Pata=" + getPata() +  "\n"
				+ "Cor=" + getCor() + "\n"
				+  "Ambiente="+ getAmbiente() + "\n"
				+ "Velocidad=" + getVelocidade() + "]";
	}

}
