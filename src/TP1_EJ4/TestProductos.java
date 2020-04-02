package TP1_EJ4;

import Common.Utils.Message;
import TP1_EJ4.Models.Producto;
import TP1_EJ4.Models.ProductoCongelado;
import TP1_EJ4.Models.ProductoFresco;
import TP1_EJ4.Models.ProductoRefrigerado;

public class TestProductos {
    public static void main(String[] args) {
        Producto producto = new Producto("10/02/2019","23213");
        ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("05/03/2017","12314","A231B");
        ProductoFresco productoFresco = new ProductoFresco("01/01/2019","7891","01/03/2017","Argentina");
        ProductoCongelado productoCongelado = new ProductoCongelado("02/05/2021","7843291",1.25);

        Message.show(producto);
        Message.show(productoRefrigerado);
        Message.show(productoFresco);
        Message.show(productoCongelado);
    }
}
