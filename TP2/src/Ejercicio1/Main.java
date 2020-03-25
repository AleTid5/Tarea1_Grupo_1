package Ejercicio1;

import Ejercicio1.Services.MarketService;

public class Main {
    public static void main(String[] args) {
        MarketService.start();
        MarketService.process();
        MarketService.showTable();
    }
}
