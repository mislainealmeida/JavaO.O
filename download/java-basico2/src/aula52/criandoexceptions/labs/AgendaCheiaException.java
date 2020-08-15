package aula52.criandoexceptions.labs;

public class AgendaCheiaException extends Exception{

	@Override
	public String getMessage() {
		
		return "Agenda já esta cheia";
	}

	
	

}
