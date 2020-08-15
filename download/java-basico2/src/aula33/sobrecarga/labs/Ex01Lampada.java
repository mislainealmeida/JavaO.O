package aula33.sobrecarga.labs;

public class Ex01Lampada {
	

	// tributos encapsulados
	private String marca;
	private String cor;
	private int potencia; 
	private int tamanho;
	private int vidaUtil; 
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	//construtores
	public Ex01Lampada() {}


	public Ex01Lampada(String marca, String cor, int potencia, int tamanho, int vidaUtil, String[] tipos,
			boolean tipoAbajur, boolean ligada) {
		this.marca = marca;
		this.cor = cor;
		this.potencia = potencia;
		this.tamanho = tamanho;
		this.vidaUtil = vidaUtil;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}

// getters e setters
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	public int getVidaUtil() {
		return vidaUtil;
	}


	public void setVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}


	public String[] getTipos() {
		return tipos;
	}


	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}


	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}


	public boolean isLigada() {
		return ligada;
	}


	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	//metodos
	public void ligarLampada() {
		setLigada(true);
		
	}
	public void desligarLampada() {
		setLigada(false);
		
	}
	public void mostrarEstado() {
		if(isLigada()) {
			System.out.println("A lampada esta ligada" );
		}else {
			System.out.println("A lampada esta desligada" );
		}
		
	}
	public void mudarEstado() {
		if(isLigada()) {
			desligarLampada();
		
		}else {
			ligarLampada();
		}

	}
}
