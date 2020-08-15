package aula52.criandoexceptions.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int opcao = 1;
		while (opcao != 3) {
			opcao = obterOpcaoMenu(scan);

			if (opcao == 1) {// consultar contato.
				String nome = lerInfoString(scan, "Entre com o nome do contato");
				try {
					if (agenda.consultarContatoPorNome(nome) > 0) {
						System.out.println("Contato existe");
					}
				} catch (ContatoNaoExiste e) {
					System.out.println(e.getMessage());
				}

			} else if (opcao == 2) {// adicionar contato.
				try {
					System.out.println("Criando um contato, entre com as informações");
					String nome = lerInfoString(scan, "Entre com o nome do contato");
					String telefon = lerInfoString(scan, "Entre com o telefone do contato");
					String email = lerInfoString(scan, "Entre com o e-mail do contato");

					Contato contato = new Contato();
					contato.setNome(nome);
					contato.setEmail(email);
					

					System.out.println("Contato a ser criado: ");
					System.out.println(contato);

					agenda.adicionarContato(contato);
				} catch (AgendaCheiaException e) {
					System.out.println(e.getMessage());
				}
			} else if (opcao == 3) {// sair
				System.exit(0);// nao usa em sistema web.
			}
		}

	}

	public static String lerInfoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 3;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada");
			System.out.println("1: Consultar o contato");
			System.out.println("2: Adicionar o contato");
			System.out.println("3: Sair");

			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;

				} else {
					throw new Exception("Entrada inválida");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
				System.out.println();

			}
		}

		return opcao;
	}

}
