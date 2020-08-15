package aula41.classeabstract;

public class Aluno extends Pessoa{
	
	
	public Aluno() {}
	
	
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


	@Override
	public String obterEtiquetaEndereco() {
		String s= "Endereço do aluno ";
		s+= super.getEndereco();
		return s;
		
	}


	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do aluno" );
		System.out.println(this.obterEtiquetaEndereco());
		
	}


	


	
	
}
