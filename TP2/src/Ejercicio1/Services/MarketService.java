package Ejercicio1.Services;

import Ejercicio1.Exceptions.InvalidCodeException;
import Ejercicio1.Models.Product;
import Utils.Helpers.Console;
import Utils.Helpers.Message;

import java.util.TreeSet;

public class MarketService {
    private static TreeSet<Product> productList = new TreeSet<>();

    public static void startProcess() {
        while (true) {
            try {
                productList.add(new Product()
                        .setCode()
                        .setName()
                        .setSoldQuantity()
                        .setPrice());

                Console.successMessage();
            } catch (InvalidCodeException e) {
                break;
            }
        }
    }

    public static void showTable() {
        Console.clear();
        Message.primary(Product.tableHeader());
        productList.forEach((Product product) -> Message.blue(product.toString()));
    }
}
