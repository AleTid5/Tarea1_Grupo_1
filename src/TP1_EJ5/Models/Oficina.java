package TP1_EJ5.Models;

import TP1_EJ5.Interfaces.Edificio;

public class Oficina implements Edificio {
	private Integer numeroDeOficinas;
	private double superficieEdificio;
	
	public Oficina(Integer numeroDeOficinas, double superficieEdificio) {
		this.setNumeroDeOficinas(numeroDeOficinas);
		this.setSuperficieEdificio(superficieEdificio);
	}
	
	@Override
	public double getSuperficieEdificio() {
		return this.superficieEdificio;
	}
	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	public Integer getNumeroDeOficinas() {
		return numeroDeOficinas;
	}
	public void setNumeroDeOficinas(Integer numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}

	@Override
	public String mostrarAtributos() {
		return String.format("La Oficina tiene %d oficinas y la superficie es de %s M2",
				this.getNumeroDeOficinas(),
				this.getSuperficieEdificio());
	}	
}
