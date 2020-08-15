package aula52.criandoexceptions.labs;

public class ContatoNaoExiste extends Exception{
	private String nome;

	public ContatoNaoExiste(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String getMessage() {
		
		return "Contato "+ nome+ " não existe na agenda";
	}

	 
	
	
	

}
