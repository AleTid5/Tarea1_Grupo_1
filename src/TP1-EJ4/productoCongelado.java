package tp1_ej4;

public class productoCongelado extends Producto{
private double temperaturaCongelacion;

public double getTemperaturaCongelacion() {
	return temperaturaCongelacion;
}

public void setTemperaturaCongelacion(float temperaturaCongelacion) {
	this.temperaturaCongelacion = temperaturaCongelacion;
}
public productoCongelado(String fechaCaducidad, String numeroLote,double temperatura) {
	super(fechaCaducidad, numeroLote);
	this.temperaturaCongelacion=temperatura;
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Este es un producto congelado: Su fecha de caducidad es "+ this.getFechaCaducidad() +" , su numero de lote es "+ this.getNumeroLote() + " y su temperatura de congelacion es " + this.temperaturaCongelacion;
}

}
