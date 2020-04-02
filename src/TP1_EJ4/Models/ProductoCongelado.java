package TP1_EJ4.Models;

public class ProductoCongelado extends Producto{
	private double temperaturaCongelacion;

	public ProductoCongelado(String fechaCaducidad, String numeroLote, double temperaturaCongelacion) {
		super(fechaCaducidad, numeroLote);
		this.setTemperaturaCongelacion(temperaturaCongelacion);
	}

	public double getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}
	public void setTemperaturaCongelacion(double temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	@Override
	public String toString() {
		return String.format("Este es un producto congelado: Su fecha de caducidad es %s, su numero de lote es %s y su temperatura de congelacion es %s",
				this.getFechaCaducidad(),
				this.getNumeroLote(),
				this.getTemperaturaCongelacion());
	}
}
