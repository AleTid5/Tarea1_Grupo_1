package TP2_EJ1.Models;

import Common.Utils.Message;
import TP2_EJ1.Exceptions.InvalidCodeException;

import java.util.Scanner;

public class Product implements Comparable {
    private Integer code = null;
    private String name = null;
    private Integer soldQuantity = null;
    private Double price = null;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Product setCode() throws InvalidCodeException {
        try {
            Message.grey("Ingrese código del artículo: ");
            Integer code = new Scanner(System.in).nextInt();

            if (code.equals(0)) throw new InvalidCodeException();
            if (code >= 1000000) throw new Exception("El codigo de artículo debe ser inferior a 1000000.");

            this.code = code;
        } catch (InvalidCodeException e) {
            throw e;
        } catch (Exception e) {
            Message.error(e.getMessage() != null ? e.getMessage() : "El código ingresado es incorrecto.");
            this.setCode();
        }

        return this;
    }

    public Product setName() {
        try {
            Message.grey("Ingrese nombre del artículo: ");
            String name = new Scanner(System.in).nextLine();

            if (name.length() > 19 || name.length() < 3)
                throw new Exception("El nombre debe contener entre 3 y 19 caracteres.");

            this.name = name;
        } catch (Exception e) {
            Message.error(e.getMessage());
            this.setName();
        }

        return this;
    }

    public Product setSoldQuantity() {
        try {
            Message.grey("Ingrese cantidad vendida: ");
            this.soldQuantity = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            Message.error("La cantidad ingresada es incorrecta.");
            this.setSoldQuantity();
        }

        return this;
    }

    public Product setPrice() {
        try {
            Message.grey("Ingrese precio del artículo: ");
            this.price = new Scanner(System.in).nextDouble();
        } catch (Exception e) {
            Message.error("El precio ingresado es incorrecto.");
            this.setPrice();
        }

        return this;
    }

    public static String tableHeader() {
        return "Nombre de Producto | Código | Cantidad total vendida | Precio";
    }

    /**
     * When to string method is invoked, it returns a string list with a specific format.
     */
    @Override
    public String toString() {
        String[] explodedHeader = Product.tableHeader().split("\\| ");
        StringBuilder nameSpaces = new StringBuilder();
        StringBuilder codeSpaces = new StringBuilder();
        StringBuilder soldQtySpaces = new StringBuilder();

        for (int i = this.name.length(); i < explodedHeader[0].length(); i++) nameSpaces.append(" ");
        for (int i = this.code.toString().length(); i < explodedHeader[1].length(); i++) codeSpaces.append(" ");
        for (int i = this.soldQuantity.toString().length(); i < explodedHeader[2].length(); i++) soldQtySpaces.append(" ");

        return String.format("%s%s| %s%s| %s%s| $%s",
                this.name,
                nameSpaces.toString(),
                this.code,
                codeSpaces,
                this.soldQuantity,
                soldQtySpaces,
                this.price);
    }

    /**
     * Compare two products. If their code is the same, it's a sufficient condition to remove it.
     * If it'snt, it is ordered descending. If 2 products have the same name, is returned the comparison obtained by code,
     * else, is returned the name comparison (we accept two products with the same name).
     */
    @Override
    public int compareTo(Object o) {
        Product product = (Product) o;
        Integer codeComparison = product.getCode().compareTo(this.code);
        Integer nameComparison = product.getName().compareTo(this.name);

        return codeComparison.equals(0) ? 0 : nameComparison.equals(0) ? codeComparison : nameComparison;
    }
}
