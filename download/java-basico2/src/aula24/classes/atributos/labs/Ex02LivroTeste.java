package aula24.classes.atributos.labs;

public class Ex02LivroTeste {

	public static void main(String[] args) {
		Ex02Livro livro = new Ex02Livro();
		
		livro.nome= "Os elefantes nao esquecem";
		livro.autor= "Agatha Christie";
		livro.editora= "HarperCollins"; 
		livro.edicao= 1;
		livro.paginas= 168;
				
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.editora);
		System.out.println(livro.edicao);
		System.out.println(livro.paginas);
		

	}

}
