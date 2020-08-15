package aula36.relacionamento.classes.labs;

public class Ex01Agenda {
	

	private String nomeAgenda;
	private Ex01Contato[] contatos;

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Ex01Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Ex01Contato[] contatos) {
		this.contatos = contatos;
	}
	public String obterInfo() {
		String info= "Nome ="+nomeAgenda +"\n";
		if (contatos !=null) {
			for(Ex01Contato c: contatos) {
				info +=c.obterInfo() +"\n";
			}
		}
		return info;
	}
	
}
