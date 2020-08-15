package aula52.criandoexceptions.labs;

public class Contato {
	
	private static int contador=0; 
	
	private String nome; 
	private String telefone;
	private String email;
	private int identificador;
	
	public Contato() {
		contador++;
		identificador= contador; 
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	@Override
	public String toString() {
		return "Contato [Nome=" + nome + ", Telefone=" + telefone + ", E-mail=" + email + ", Identificador="
				+ identificador + "]";
	} 
	
	

}
