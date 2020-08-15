package aula43.classe.object;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setCurso("ADS");
		double[] notas= {10,9,8,7};
		aluno.setNotas(notas);

		System.out.println(aluno.toString());
	}

}
