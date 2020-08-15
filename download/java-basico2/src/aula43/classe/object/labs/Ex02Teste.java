package aula43.classe.object.labs;

public class Ex02Teste {

	public static void main(String[] args) {
		Ex02PJ p1 = new Ex02PJ();
		p1.setNome("Contribuinte 01");
		p1.setCnpj("10.684.822/0001-92");
		p1.setRendaBruta(1000);
		
		Ex02PJ p2 = new Ex02PJ();
		p2.setNome("Contribuinte 02");
		p2.setCnpj("91.403.512/0001-54");
		p2.setRendaBruta(3000);

		Ex02PJ p3 = new Ex02PJ();
		p3.setNome("Contribuinte 03");
		p3.setCnpj("35.434.693/0001-05");
		p3.setRendaBruta(5000);
		
		Ex02PF p4 = new Ex02PF();
		p4.setNome("Contribuinte 04");
		p4.setCpf("583.358.456-62");;
		p4.setRendaBruta(2000);
		
		Ex02PF p5 = new Ex02PF();
		p5.setNome("Contribuinte 05");
		p5.setCpf("547.653.548-90");
		p5.setRendaBruta(3500);
		
		Ex02PF p6 = new Ex02PF();
		p6.setNome("Contribuinte 06");
		p6.setCpf("828.277.078-70");
		p6.setRendaBruta(2200);
		
		Ex02Contribuinte[] contribuintes= new Ex02Contribuinte[6];
		contribuintes[0]=p1;
		contribuintes[1]=p2;
		contribuintes[2]=p3;
		contribuintes[3]=p4;
		contribuintes[4]=p5;
		contribuintes[5]=p6;
		
		for (int i=0; i<contribuintes.length; i++) {
			System.out.println(contribuintes[i]);
		}
}
}
