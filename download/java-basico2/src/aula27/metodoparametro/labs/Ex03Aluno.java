package aula27.metodoparametro.labs;

public class Ex03Aluno {

	String nome;
	String matricula;
	String nomeCurso;
	String[] disciplinas = new String[3];
	double[][] notas = new double[3][4];
	
	void mostrarInfo() {
		System.out.println("Nome: "+ nome);
		System.out.println("Matrícula: "+ matricula);
		System.out.println("Nome do curso: "+  nomeCurso);	
		
		for (int i=0; i<notas.length; i++) {
			System.out.println("Notas da disciplina: " +disciplinas[i]);
			for (int j=0; j<notas[i].length; j++) {
				System.out.println (notas[i][j]+" ");
				
			}
			System.out.println();
	}
		

}
	boolean verificarAprovado(int indice) {
		
		double soma=0;
		
		for (int i=0; i<notas[indice].length; i++) {
			soma+= notas[indice][i];
			
		}
		
		double media= soma/4;
		
		if (media >= 7) {				
			return true;
		}
			return false;
		}
	}


