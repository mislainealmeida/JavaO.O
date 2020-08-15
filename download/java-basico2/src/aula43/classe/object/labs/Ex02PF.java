package aula43.classe.object.labs;

public class Ex02PF extends Ex02Contribuinte{

	private String cpf;
		
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	@Override
	public double calcularImposto() {
		double renda=this.getRendaBruta();
		double imposto=0;
		if (renda>0 && renda<=1400) {
			imposto = renda;
			return imposto;
		}else if( renda>1400 && renda <=2100) {
			imposto= (renda *0.1)-100;
			return imposto;
		}else if( renda>2100 && renda <=2800) {
			imposto= (renda *0.15)-270;
			return imposto;
		}else if( renda>2800 && renda <=3600) {
			imposto= (renda *0.25)-500;
			return imposto;
		}else if( renda>3600) {
			imposto= (renda *0.3)-700;
			
		}return imposto;
		
	}
	@Override
	public String toString() {
		String s="Pessoa Física [";
		s +=" cpf: "+cpf;
		s+=" ;imposto a ser pago: "+ calcularImposto();
		s+= " ]";
		return s;
	}
	

	
	
	
	

}
