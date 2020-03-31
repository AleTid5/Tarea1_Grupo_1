package TP1_EJ5.Models;

import TP1_EJ5.Interfaces.Edificio;
import TP1_EJ5.Interfaces.InstalacionDeportiva;

public class Polideportivo implements Edificio, InstalacionDeportiva {
	
	private String nombre;
	private double superficie;
	private int tipoDeInstalacion;
	
	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		super();
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
	public int getTipoDeInstalacion() {
		return this.tipoDeInstalacion;
	}
	
	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		return this.superficie;
	}
	
	public void setSuperficieEdificio(double superficie) {
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String mostrarAtributos() {
		return String.format("El nombre del polideportivo es %s, tiene una superficie de %s M2, y su tipo de instalacion es %d ",
				this.getNombre(),
				this.getSuperficieEdificio(),
				this.getTipoDeInstalacion());
	}	
}
