package Ejercicio1.Services;

import Ejercicio1.Exceptions.InvalidCodeException;
import Ejercicio1.Models.Product;
import Utils.Helpers.Console;
import Utils.Helpers.Message;

import java.util.Scanner;
import java.util.TreeSet;

public class MarketService {
    private static TreeSet<Product> productList = new TreeSet<>();

    public static void startProcess() {
        boolean loadSale = true;

        while (loadSale) {
            try {
                Product product = new Product();

                Message.grey("Ingrese código del artículo: ");
                product.setCode(new Scanner(System.in).nextInt());

                if (product.getCode().equals(0)) {
                    throw new InvalidCodeException();
                }

                Message.grey("Ingrese nombre del artículo: ");
                product.setName(new Scanner(System.in).nextLine());

                Message.grey("Ingrese cantidad vendida: ");
                product.setSoldQuantity(new Scanner(System.in).nextInt());

                Message.grey("Ingrese precio del artículo: ");
                product.setPrice(new Scanner(System.in).nextDouble());

                productList.add(product);
            } catch (InvalidCodeException e) {
                loadSale = false;
            } catch (Exception e) {
                Message.error("El valor ingresado es incorrecto.");
                Console.sleep(1200);
            } finally {
                Console.clear();
            }
        }
    }

    public static void showTable() {
        Message.primary(Product.tableHeader());
        productList.forEach((Product product) -> Message.blue(product.toString()));
    }
}
