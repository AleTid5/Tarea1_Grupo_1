package TP2_EJ1.Services;

import Common.Utils.Console;
import Common.Utils.Message;
import TP2_EJ1.Exceptions.InvalidCodeException;
import TP2_EJ1.Models.Product;

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
        Message.warning(Product.tableHeader());
        productList.forEach((Product product) -> Message.greyBlue(product.toString()));
    }
}
