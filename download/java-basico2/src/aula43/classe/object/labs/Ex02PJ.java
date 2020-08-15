package aula43.classe.object.labs;

public class Ex02PJ extends Ex02Contribuinte{
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	@Override
	public double calcularImposto() {
		double imposto= this.getRendaBruta() * 0.1; 
		return imposto;
	}
	public String toString() {
		String s="Pessoa Jurídica [";
		s +=" cnpj: "+cnpj;
		s+=" ;imposto a ser pago: "+ calcularImposto();
		s+= " ]";
		return s;
	}

	
	
	

}
