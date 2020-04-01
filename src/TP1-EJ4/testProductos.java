package tp1_ej4;

public class testProductos {

	public static void main(String[] args) {
		Producto p=new Producto("10/02/2019","23213");
		productoRefrigerado pr=new productoRefrigerado("05/03/2017","12314","A231B");
		productoFresco pf=new productoFresco("01/01/2019","7891","01/03/2017","Argentina");
		productoCongelado pc=new productoCongelado("02/05/2021","7843291",1.25);
		System.out.println(p.toString());
		System.out.println(pr.toString());
		System.out.println(pf.toString());
		System.out.println(pc.toString());
	}

}
