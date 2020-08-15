package aula24.classes.atributos.labs;

public class Ex03LivrariaTeste {

	public static void main(String[] args) {
		
		Ex03Livraria livro = new Ex03Livraria();
		
		livro.nome= "Os elefantes nao esquecem";
		livro.autor= "Agatha Christie";
		livro.editora= "HarperCollins"; 
		livro.edicao= 1;
		livro.paginas= 168;
		livro.preco= 29.9;
		
				
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.editora);
		System.out.println(livro.edicao);
		System.out.println(livro.paginas);
		System.out.println(livro.preco);
		

	}

}
