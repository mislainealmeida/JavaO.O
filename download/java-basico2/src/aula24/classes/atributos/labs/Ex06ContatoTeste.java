package aula24.classes.atributos.labs;

public class Ex06ContatoTeste {

	public static void main(String[] args) {
		Ex06Contato contato = new Ex06Contato();
		
		contato.nome= "Mislaine";
		

		contato.telefones = new String[3];
		contato.telefones[0]= "Celular: 98721-3172";
		contato.telefones[1]= "Fixo: 3552-4703";
		contato.telefones[2]= "Trabalho 3551-6810";
		
		System.out.println(contato.nome);
		System.out.println(contato.telefones[0]);
		System.out.println(contato.telefones[1]);
		System.out.println(contato.telefones[2]);
		
		
		

	}

}
