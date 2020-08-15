package aula27.metodoparametro.labs;

public class Ex01LampadaTeste {

	public static void main(String[] args) {

		Ex01Lampada lampada = new Ex01Lampada();

		lampada.marca = "Positivo";
		lampada.cor = "Branca";
		lampada.potencia = 9;
		lampada.tamanho = 6;
		lampada.vidaUtil = 4000;
		lampada.tipoAbajur = true;

		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampiões";

		System.out.println(lampada.marca);
		System.out.println(lampada.cor);
		System.out.println(lampada.potencia);
		System.out.println(lampada.tamanho);
		System.out.println(lampada.vidaUtil);
		System.out.println(lampada.tipoAbajur);
		System.out.println(lampada.tipos[0]);
		System.out.println(lampada.tipos[1]);

		lampada.ligarLampada();
		lampada.mostrarEstado();
		lampada.desligarLampada();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();

	}
}
