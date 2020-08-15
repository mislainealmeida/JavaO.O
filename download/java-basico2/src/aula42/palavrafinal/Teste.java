package aula42.palavrafinal;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa= new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		System.out.println(Constante.URL_BLOG);
		Constante.URL_BLOG= "abcde";
		System.out.println(Constante.URL_BLOG);
		
		//final não é possível modificar os valores. 
		System.out.println(Constante.CURSO_COMPLETO);
		//Constante.CURSO_COMPLETO= "ABCD";
		System.out.println(Constante.CURSO_COMPLETO);
		
		
		
		
		

	}

}
