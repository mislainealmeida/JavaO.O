package aula24.classes.atributos.labs;
import java.util.Date; 

public class Ex04BibliotecaTeste {

	public static void main(String[] args) {
		
		 Ex04Biblioteca livro = new  Ex04Biblioteca();
		
		livro.nome= "Os elefantes nao esquecem";
		livro.autor= "Agatha Christie";
		livro.editora= "HarperCollins"; 
		livro.edicao= 1;
		livro.paginas= 168;
		livro.ISBN= "000-000";
		livro.prazo= 15;
		livro.dataEntrega= new Date();
				
		
				
		System.out.println("Nome: "+livro.nome);
		System.out.println("Autor: "+livro.autor);
		System.out.println("Editora: "+livro.editora);
		System.out.println("Edição: "+livro.edicao);
		System.out.println("Paginas: "+livro.paginas);
		System.out.println("ISBN: "+livro.ISBN);
		System.out.println("Prazo: "+livro.prazo + " dias");
		System.out.println("Entrega: "+livro.dataEntrega);
		
		

	}

}
