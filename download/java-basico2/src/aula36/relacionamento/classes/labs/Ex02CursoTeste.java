package aula36.relacionamento.classes.labs;

import java.util.Scanner;

public class Ex02CursoTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex02Curso curso = new Ex02Curso();
		curso.setNome("Curso: ADS");
		curso.setHorario("Horário: 19:00 as 20:00");
		System.out.println();

		System.out.println(curso.getNome());
		System.out.println(curso.getHorario());
		System.out.println();

		Ex02Professor prof = new Ex02Professor();
		prof.setNomeProfessor("Professor: Eduardo");
		prof.setDepartamento("Departamento: Algoritmo");
		prof.setEmail("E-mail: edu@gmail.com");
		curso.setProfessor(prof);

		System.out.println(prof.getNomeProfessor());
		System.out.println(prof.getDepartamento());
		System.out.println(prof.getEmail());
		System.out.println();

		Ex02Aluno aluno = new Ex02Aluno();
		aluno.setNomeAluno("Aluno 1: Mislaine");
		aluno.setMatricula("Matrícula: 1234");

		Ex02Aluno aluno1 = new Ex02Aluno();
		aluno1.setNomeAluno("Aluno 2: Juliana");
		aluno1.setMatricula("Matrícula: 1235");

		curso.getAlunos();

		System.out.println(aluno.getNomeAluno());
		System.out.println(aluno.getMatricula());
		System.out.println();

		System.out.println(aluno1.getNomeAluno());
		System.out.println(aluno1.getMatricula());
		System.out.println();

		Ex02Aluno[] alunos = new Ex02Aluno[2];
		alunos[0] = aluno;
		alunos[1] = aluno1;

		for (int i = 0; i < alunos.length; i++) {

			int encerrarPedidoNotas = 0;
			double[] notas;
			int qtdeNotas = 0;

			System.out.println("Digite a quantidade de notas para o aluno");
			qtdeNotas = scan.nextInt();
			notas = new double[qtdeNotas];

			for (int k = 0; k < qtdeNotas; k++) {
				System.out.println("Entre com a nota " + (k + 1) + " do aluno " + (k + 1));
				notas[k] = scan.nextDouble();
			}

			alunos[i].setNotas(notas);

			alunos[i].verificarMediaParaAprovacao();

		}

	}
}