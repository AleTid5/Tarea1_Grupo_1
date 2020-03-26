package Ejercicio1.Models;

public class Product implements Comparable {
    private Integer code = null;
    private String name = null;
    private Integer soldQuantity = null;
    private Double price = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) throws Exception {
        if (code >= 1000000) throw new Exception("El codigo de artículo debe ser inferior a 100000.");

        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.length() > 19) throw new Exception("El nombre puede contener hasta 19 caracteres.");

        this.name = name;
    }

    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public void setPrice(Double price) {
        this.price = price;
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
