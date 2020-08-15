package aula27.metodoparametro.labs;

public class Ex01Lampada {
	
	String marca;
	String cor;
	int potencia; 
	int tamanho;
	int vidaUtil; 
	String[] tipos;
	boolean tipoAbajur;
	boolean ligada;
	
	void ligarLampada() {
		ligada=true;
		
	}
	void desligarLampada() {
		ligada=false;
		
	}
	void mostrarEstado() {
		if(ligada) {
			System.out.println("A lampada esta ligada" );
		}else {
			System.out.println("A lampada esta desligada" );
		}
		
	}
	void mudarEstado() {
		if(ligada) {
			desligarLampada();
		
		}else {
			ligarLampada();
		}
	}
	
	
	

}
