package aula36.relacionamento.classes;

public class ContatoTeste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Mislaine");
		// contato.setEndereco("Guaxupé");
		// contato.setTelefone("35 98888-8888");

		// criar objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("The good place");
		end.setNumCasa("100");
		end.setCidade("Céu");
		end.setCep("12111-000");
		end.setEstado("Minas Gerais");
		
		contato.setEndereco(end);

		// criar objeto telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("35");
		telefone.setNum("91111-1111");

		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("35");
		telefone2.setNum("98111-1111");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;

		// contato.setTelefone(tel);
		contato.setTelefones(telefones);
		

		System.out.println(contato.getNome());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade()+ " "+ contato.getEndereco().getEstado());
		}
		
		/*
		 * if (contato != null && contato.getTelefone() != null) {
		 * System.out.println(contato.getTelefone().getDdd() + " " +
		 * contato.getTelefone().getNum()); }
		 */

		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNum());
			}
		}

	}
}
