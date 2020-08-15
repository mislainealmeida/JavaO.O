package aula45.castinginstanceof;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno= new Aluno();
		Pessoa pessoaAluno= aluno;//upcasting
		
		Pessoa aluno1= new Aluno(); //ou
		Pessoa aluno2=(Pessoa) new Aluno();
		
		Aluno aluno3= (Aluno) pessoaAluno; //downcasting
		Pessoa aluno4= new Pessoa();
		
		//downcasting nem sempre funciona. 

		Pessoa pessoa = new Pessoa();
		Aluno alun=new Aluno();
		Professor prof= new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("é do tipo Pessoa");
		}
	  
	if (alun instanceof Aluno) {
		System.out.println("é do tipo Aluno");
	}
	if (prof instanceof Professor) {
		System.out.println("é do tipo Professor");
	}
	}
}