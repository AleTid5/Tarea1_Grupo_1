package tp1_ej4;

public class productoRefrigerado extends Producto{
private String codigoOrganismo;

public String getCodigoOrganismo() {
	return codigoOrganismo;
}

public void setCodigoOrganismo(String codigoOrganismo) {
	this.codigoOrganismo = codigoOrganismo;
}

public productoRefrigerado(String fechaCaducidad, String numeroLote,String codigo) {
	super(fechaCaducidad, numeroLote);
	this.codigoOrganismo=codigo;
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Este es un producto refrigerado: Su fecha de caducidad es "+ this.getFechaCaducidad() +" , su numero de lote es "+ this.getNumeroLote() + " y su codigo de organismo es " + this.codigoOrganismo;
}

}
