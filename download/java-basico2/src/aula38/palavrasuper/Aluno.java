package aula38.palavrasuper;

public class Aluno extends Pessoa{
	// this: referencia prorpia classe e super referencia a classe super 
	
	public Aluno() {
		super();// vai chamar a super classe
		
	}
	
	
	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.curso=curso;
	}


	private String curso; 
	private double[] notas;
	

	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	} 
	

	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	
}
