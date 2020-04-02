package TP1_EJ4.Models;

public class Producto {
	private String fechaCaducidad;
	private String numeroLote;

	public Producto(String fechaCaducidad, String numeroLote) {
		this.setFechaCaducidad(fechaCaducidad);
		this.setNumeroLote(numeroLote);
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	@Override
	public String toString() {
		return String.format("Este es un producto: Su fecha de caducidad es %s y su numero de lote es %s",
				this.getFechaCaducidad(),
				this.getNumeroLote());
	}
}
