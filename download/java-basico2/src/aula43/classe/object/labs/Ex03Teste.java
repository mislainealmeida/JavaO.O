package aula43.classe.object.labs;

public class Ex03Teste {

	public static void main(String[] args) {
		
		Ex03Animal camelo= new Ex03Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.5);
		
		Ex03Peixe tubarao= new Ex03Peixe();
		
		tubarao.setNome("Tubarao");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Ex03Mamifero urso = new Ex03Mamifero();
		urso.setNome("Urso- do - Canadá");
		urso.setComprimento(180);
		urso.setCor("Vermelho");
		urso.setVelocidade(0.5);
		urso.setAlimento("Mel");
		
		Ex03Animal[] animais = new Ex03Animal[3];
		animais[0]= camelo;
		animais[1]= tubarao;
		animais[2]= urso;
		
		System.out.println("---------------------------");
		for (int i=0; i<animais.length; i++) {
			System.out.println(animais[i]);
			System.out.println("---------------------------");
			
		}
		
	
		
		
		

	}

}
