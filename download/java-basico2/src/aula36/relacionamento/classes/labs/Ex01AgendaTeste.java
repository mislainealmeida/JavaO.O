package aula36.relacionamento.classes.labs;
import java.util.Scanner;

public class Ex01AgendaTeste {


	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda ");
		String nomeAgenda= scan.next();
		
		Ex01Agenda agenda= new Ex01Agenda();
		agenda.setNomeAgenda(nomeAgenda);
		
		Ex01Contato[] contatos= new Ex01Contato[3];//criar array de contatos
		for(int i=0; i<3; i++) {
			System.out.println("Entre com as informações do contato "+ (i+1));
			Ex01Contato c= new Ex01Contato();
			System.out.println();
			
			System.out.println("Entre com o nome "+ (i+1));
			String nome= scan.next();
			c.setNome(nome);
			
			
			System.out.println("Entre com o telefone "+ (i+1));
			String telefone= scan.next();
			c.setTelefone(telefone);
			
			
			System.out.println("Entre com o e-mail "+ (i+1));
			String email= scan.next();
			c.setEmail(email);
			
			contatos[i]=c;//adicionar os setters no array
	
			
		}
		agenda.setContatos(contatos);
		if (agenda!=null) {
			System.out.println(agenda.obterInfo());
		}
		

	}

}
