package main;
public class RangosMantenibilidad {

	private int minimo;
	private int maximo;
	private int modularidad;
	private int reusabilidad;
	private int analizabilidad;
	private int capacidadModi;
	private int capacidadProba;
	
	public RangosMantenibilidad(int minimo, int maximo, int modularidad, int reusabilidad, int analizabilidad,
			int capacidadModi, int capacidadProba) {
		super();
		this.minimo = minimo;
		this.maximo = maximo;
		this.modularidad = modularidad;
		this.reusabilidad = reusabilidad;
		this.analizabilidad = analizabilidad;
		this.capacidadModi = capacidadModi;
		this.capacidadProba = capacidadProba;
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

	public int getModularidad() {
		return modularidad;
	}

	public void setModularidad(int modularidad) {
		this.modularidad = modularidad;
	}

	public int getReusabilidad() {
		return reusabilidad;
	}

	public void setReusabilidad(int reusabilidad) {
		this.reusabilidad = reusabilidad;
	}

	public int getAnalizabilidad() {
		return analizabilidad;
	}

	public void setAnalizabilidad(int analizabilidad) {
		this.analizabilidad = analizabilidad;
	}

	public int getCapacidadModi() {
		return capacidadModi;
	}

	public void setCapacidadModi(int capacidadModi) {
		this.capacidadModi = capacidadModi;
	}

	public int getCapacidadProba() {
		return capacidadProba;
	}

	public void setCapacidadProba(int capacidadProba) {
		this.capacidadProba = capacidadProba;
	}
	
	
	
}
