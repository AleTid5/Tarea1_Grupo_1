package tp1_ej4;

public class Producto {
private String fechaCaducidad;
private String numeroLote;
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
public Producto(String fechaCaducidad, String numeroLote) {
	super();
	this.fechaCaducidad = fechaCaducidad;
	this.numeroLote = numeroLote;
}
@Override
public String toString() {
	return "Este es un producto: Su fecha de caducidad es "+ fechaCaducidad +" y su numero de lote es "+ numeroLote;
}

}
