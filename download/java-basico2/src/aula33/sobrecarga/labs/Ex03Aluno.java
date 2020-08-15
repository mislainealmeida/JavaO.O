package aula33.sobrecarga.labs;

public class Ex03Aluno {
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] disciplinas = new String[3];
	private double[][] notas = new double[3][4];

	public Ex03Aluno() {}

	public Ex03Aluno(String nome, String matricula, String nomeCurso, String[] disciplinas, double[][] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.disciplinas = new String[3];
		this.notas =  new double[3][4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas da disciplina: " + disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println(notas[i][j] + " ");

			}
			System.out.println();
		}

	}

	public boolean verificarAprovado(int indice) {

		double soma = 0;

		for (int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];

		}

		double media = soma / 4;

		if (media >= 7) {
			return true;
		}
		return false;
	}
public void setDisciplinasPos(int pos, String disciplina) {
	this.disciplinas[pos]= disciplina;
}
public void setNomePosIJ(int posI, int posJ, double nota) {
	this.getNotas()[posI][ posJ]= nota;
}
}
