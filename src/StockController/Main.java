package StockController;

import StockService.StockService;
import Utility.Utility;

public class Main {
    public static void main(String[] args) {
        StockService stockService = new StockService();

        int choice = 0;
        int EXIT_VALUE = 6;
        while (choice != EXIT_VALUE){
            Utility.displayOptions();
            choice = Utility.readInteger();
            switch (choice){
                case 1:
                    stockService.addStock();
                    break;
                case 2:
                    stockService.getStockDetails();
                    break;
                case 3:
                    stockService.buyShare();
                    break;
                case 4:
                    stockService.sellShares();
                    break;
                case 5:
                    stockService.printReport();
                    break;

            }
        }
    }
}
