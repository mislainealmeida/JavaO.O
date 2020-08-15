package aula33.sobrecarga.labs;


public class Ex01LampadaTeste {

	public static void main(String[] args) {
		Ex01Lampada lampada = new Ex01Lampada();

		
		lampada.ligarLampada();
		lampada.mostrarEstado();
		lampada.desligarLampada();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();

	}

}
