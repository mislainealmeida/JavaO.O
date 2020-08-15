package aula36.relacionamento.classes.labs;

public class Ex02Aluno {

	private String nomeAluno;
	private String matricula;
	private double[] notas;

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void verificarMediaParaAprovacao() {

		double soma = 0;
		int qtdeNotas = notas.length;
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
			System.out.println(soma);
		}

		media = soma / notas.length;
		System.out.println(media);

		if (media >= 7.0) {
			System.out.println("APROVADO");
			
		}else {
			System.out.println("REPROVADO");
		}
		
		
	}

}
