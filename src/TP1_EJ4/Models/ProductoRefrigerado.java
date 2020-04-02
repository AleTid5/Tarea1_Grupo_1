package TP1_EJ4.Models;

public class ProductoRefrigerado extends Producto{
	private String codigoOrganismo;

	public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoOrganismo) {
		super(fechaCaducidad, numeroLote);
		this.setCodigoOrganismo(codigoOrganismo);
	}

	public String getCodigoOrganismo() {
		return codigoOrganismo;
	}
	public void setCodigoOrganismo(String codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

	@Override
	public String toString() {
		return String.format("Este es un producto refrigerado: Su fecha de caducidad es %s, su numero de lote es %s y su codigo de organismo es %s",
				this.getFechaCaducidad(),
				this.getNumeroLote(),
				this.getCodigoOrganismo());
	}
}
