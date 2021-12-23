package main;
public class RangosAdecuaccion {
	
	//clase que se encarga de almacenar la tabla de datos atraves de objetos
	private int minimo;
	private int maximo;
	private int completitud;
	private int correcion;
	private int pertinencia;
	
	public RangosAdecuaccion(int minimo, int maximo, int completitud, int correcion, int pertinencia) {
		super();
		this.minimo = minimo;
		this.maximo = maximo;
		this.completitud = completitud;
		this.correcion = correcion;
		this.pertinencia = pertinencia;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getCompletitud() {
		return completitud;
	}

	public void setCompletitud(int completitud) {
		this.completitud = completitud;
	}

	public int getCorrecion() {
		return correcion;
	}

	public void setCorrecion(int correcion) {
		this.correcion = correcion;
	}

	public int getPertinencia() {
		return pertinencia;
	}

	public void setPertinencia(int pertinencia) {
		this.pertinencia = pertinencia;
	}
	

	
}
