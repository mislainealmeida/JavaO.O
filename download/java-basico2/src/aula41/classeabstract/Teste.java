package aula41.classeabstract;

public class Teste {

	public static void main(String[] args) {
		
		// Pessoa pessoa = new Pessoa(); não pode instanciar a classe abastract
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 1, num 1");
		professor.setEndereco("Rua 1, num 1");
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
		
		
		
		
		

	}

}
