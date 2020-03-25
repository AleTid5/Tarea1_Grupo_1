package Ejercicio1.Models;

import java.util.ArrayList;

public class Product {
    private Integer code = null;
    private String name = null;
    private Integer soldQuantity = null;
    private Double price = null;

    public boolean equals(Product product){
        return this.code.equals(product.getCode());
    }

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

    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder nameSpaces = new StringBuilder();
        StringBuilder codeSpaces = new StringBuilder();
        StringBuilder soldQtySpaces = new StringBuilder();

        for (int i = this.name.length(); i < 19; i++) nameSpaces.append(" ");
        for (int i = this.code.toString().length(); i < 7; i++) codeSpaces.append(" ");
        for (int i = this.soldQuantity.toString().length(); i < 23; i++) soldQtySpaces.append(" ");

        return String.format("%s%s| %s%s| %s%s| $%s",
                this.name,
                nameSpaces.toString(),
                this.code,
                codeSpaces,
                this.soldQuantity,
                soldQtySpaces,
                this.price);
    }
}
