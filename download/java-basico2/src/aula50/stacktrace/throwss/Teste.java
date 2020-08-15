package aula50.stacktrace.throwss;

public class Teste {

	public static void main(String[] args) {
		int[] numeros= {4,8,16,32,64,128};
		int [] denom= {2,0,4,8,0};
		
		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i]+" / "+ denom[i]+ " = "+ (numeros[i]/denom[i]));	
			}
			catch(Exception e1){
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}
			// thorows: dispara uma exceção, passa a responsabilidade pra quem for utilizar o método. 
			//Exceptions disparadas em tempo de execução (arrayOutfBounds) não necessitam de throws explicitamente. 
		}

	}

}
