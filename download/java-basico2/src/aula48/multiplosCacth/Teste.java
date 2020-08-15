package aula48.multiplosCacth;

public class Teste {

	public static void main(String[] args) {
		
		int[] numeros= {2,4,8,16,32,64,128};
		int [] denom= {2,0,4,8,0};
		
		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i]+" / "+ denom[i]+ " = "+ (numeros[i]/denom[i]));	
			}
			catch(ArithmeticException e1){
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Faltando denominador");
			
			// se nao souber qual sera a exception usa Throwabe( a mae de todos os erros, uma forma genérica. 
		    }catch(Throwable e3) {
			System.out.println("Faltando denominador");
		}
			// tbm posso, a partir do java 7 colocar os erros da mesma familia juntos. 
			/*catch(ArithmeticException | ArrayIndexOutOfBoundsException e1){
				System.out.println("Erro");*/
	}
	}
}

