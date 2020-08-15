package aula27.metodoparametro.labs;

import java.util.Scanner;

public class Ex03AlunoTeste {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		Ex03Aluno aluno = new Ex03Aluno();
		
		System.out.println("Entre com o nome do aluno");
		aluno.nome=scan.next();
		System.out.println("Entre com a matrícula");
		aluno.matricula=scan.next();
		System.out.println("Entre com o nome do Curso");
		aluno.nomeCurso=scan.next();
		

		
		for (int i = 0; i <aluno.disciplinas.length; i++) {
				System.out.println("Entre com a disciplina " +(i+1));
				aluno.disciplinas[i]= scan.next();
		}				

		for(int i=0; i<aluno.notas.length; i++) {
			System.out.println("Obtendo notas "+aluno.disciplinas[i]);
			for (int j=0; j<aluno.notas[i].length;j++) {
				System.out.println("Entre com a nota "+(j+1));
				aluno.notas[i][j]= scan.nextDouble();
			}
		}
		aluno.mostrarInfo();
		
		for (int i=0; i<aluno.disciplinas.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina "+aluno.disciplinas[i] +" foi APROVADO");
				
			}else {
				System.out.println("Disciplina "+aluno.disciplinas[i] +" foi REPROVADO");
			}
		}
		
	}
	}