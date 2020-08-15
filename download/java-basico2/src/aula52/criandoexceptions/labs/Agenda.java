package aula52.criandoexceptions.labs;

import java.util.Arrays;

public class Agenda {
	private Contato[] contatos;

	public Agenda() {
		contatos= new Contato[5];
	}
	

	public void adicionarContato(Contato c) throws AgendaCheiaException {
		boolean cheia= true;
		for (int i=0; i<contatos.length; i++) {
			if(contatos[i]== null) {
				contatos[i]= c;
				cheia= false;
				break;
			}
		}
		if(cheia) {
			//lançar exception aqui
			throw new AgendaCheiaException();
		}
	}
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExiste  {
		for (int i=0; i<contatos.length; i++) {
			if(contatos[i]!= null) {
				if(contatos[i].getNome().equalsIgnoreCase(nome));
				return i;
			}
		}
		throw new ContatoNaoExiste(nome);
	}
	

	@Override
	public String toString() {
		String s= " ";
		for(Contato c: contatos) {
			s+=c.toString() +"\n";
		}
		return s;
	}
	


	
	
	
	

}
