package tp1_ej4;

public class productoFresco extends Producto{

private String fechaEnvasado;
private String paisOrigen;
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
public productoFresco(String fechaCaducidad, String numeroLote,String fechaEnvasado,String paisOrigen) {
	super(fechaCaducidad, numeroLote);
	this.fechaEnvasado=fechaEnvasado;
	this.paisOrigen=paisOrigen;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Este es un producto fresco: Su fecha de caducidad es "+ this.getFechaCaducidad() +" , su numero de lote es "+ this.getNumeroLote() + " ,su fecha de envasado " + this.getFechaEnvasado() + "y su pais de origen es "+this.paisOrigen ;
}

}
