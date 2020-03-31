package TP1_EJ5.Models;

import TP1_EJ5.Interfaces.Edificio;

public class Oficina implements Edificio {

	private int numeroDeOficinas;
	private double superficie;
	
	public Oficina(int numeroDeOficinas, double superficie) {
		super();
		this.numeroDeOficinas = numeroDeOficinas;
		this.superficie = superficie;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return this.superficie;
	}
	
	public void setSuperficieEdificio(double superficie) {
		this.superficie = superficie;
	}

	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}

	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}

	@Override
	public String mostrarAtributos() {
		return String.format("La Oficina tiene %d oficinas y la superficie es de %s M2",
				this.getNumeroDeOficinas(),
				this.getSuperficieEdificio());
	}	
}
