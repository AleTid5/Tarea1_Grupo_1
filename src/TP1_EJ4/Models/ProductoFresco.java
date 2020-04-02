package TP1_EJ4.Models;

public class ProductoFresco extends Producto{
	private String fechaEnvasado;
	private String paisOrigen;

	public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.setFechaEnvasado(fechaEnvasado);
		this.setPaisOrigen(paisOrigen);
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return String.format("Este es un producto fresco: Su fecha de caducidad es %s, su numero de lote es %s, su fecha de envasado es %s y su pais de origen es %s",
				this.getFechaCaducidad(),
				this.getNumeroLote(),
				this.getFechaEnvasado(),
				this.getPaisOrigen());
	}
}
