package aula33.sobrecarga.labs;

import java.util.Scanner;


public class Ex03AlunoTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Ex03Aluno aluno = new Ex03Aluno();
		
		System.out.println("Entre com o nome do Aluno:");
		aluno.setNome(scan.next());
		System.out.println("Entre com o nome da Matricula:");
		aluno.setMatricula(scan.next());
		System.out.println("Entre com o nome do Curso:");
		aluno.setNomeCurso(scan.next());
		

		
		for (int i = 0; i <aluno.getDisciplinas().length; i++) {
				System.out.println("Entre com o nome da disciplina "+i);
				aluno.setDisciplinasPos(i, scan.next());
		}			

		for(int i=0; i<aluno.getNotas().length; i++) {
			System.out.println("Obtendo notas "+aluno.getDisciplinas()[i]);
			for (int j=0; j<aluno.getNotas()[i].length;j++) {
				System.out.println("Entre com a nota "+(j+1));
				aluno.getNotas()[i][j]= scan.nextDouble();
				aluno.setNomePosIJ(i, j, scan.nextDouble());
			}
		}
		aluno.mostrarInfo();
		
		for (int i=0; i<aluno.getDisciplinas().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina "+aluno.getDisciplinas()[i] +" foi APROVADO");
				
			}else {
				System.out.println("Disciplina "+aluno.getDisciplinas()[i] +" foi REPROVADO");
			}
		}
		
	}

	}
