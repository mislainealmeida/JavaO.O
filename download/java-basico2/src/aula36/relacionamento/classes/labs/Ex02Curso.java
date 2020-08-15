package aula36.relacionamento.classes.labs;

public class Ex02Curso {

	private String nome; 
	private String horario;
	private Ex02Professor professor;
	private Ex02Aluno[] Alunos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Ex02Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Ex02Professor professor) {
		this.professor = professor;
	}
	public Ex02Aluno[] getAlunos() {
		return Alunos;
	}
	public void setAlunos(Ex02Aluno[] Alunos) {
		this.Alunos = Alunos;
	}
	
	
	
	
}
