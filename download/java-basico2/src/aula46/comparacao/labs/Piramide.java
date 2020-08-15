package aula46.comparacao.labs;

public class Piramide extends Figura3D {
	
	private double arestaBase;
	private double apotema;
	private double altura;
	private double numPoliBase;
	
	private Figura2D base;
	
	

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	
	public double getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(double numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	@Override
	public double calcularVolume() {
		if (base !=null) {
			 return (numPoliBase *((arestaBase*apotema)/2)+ base.calcularArea());
		}
		return 0;
		
	}

	@Override
	public double calcularArea() {
		if(base !=null) {
		return (base.calcularArea()* altura)/3;
		}
		return 0;
	}

}
