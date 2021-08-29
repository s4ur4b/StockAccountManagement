package StockService;

import StockModel.StockAccountModel;
import Utility.Utility;

import java.util.LinkedList;

public class StockService {

    private LinkedList<StockAccountModel> stockList = new LinkedList<>();

    public void addStock() {
        int option = 0;
        while(option != 2) {
            System.out.println("Press 1 - to add stock");
            System.out.println("Press 2 - to exit");
            option = Utility.readInteger();
            switch (option) {
                case 1:
                   String name =  Utility.getStockName();
                   int price = Utility.getStockPrice();
                   int number = Utility.getNumberOfShares();
                    StockAccountModel stockAccountModel = new StockAccountModel(name, price, number);
                    stockList.add(stockAccountModel);
                    break;
                case 2:
                    break;
            }
        }
    }

    public void printReport() {
        for (StockAccountModel item: stockList) {
            System.out.println(item);
            int shareValue = item.numberOfShares * item.price;
            System.out.print("Share value of "+item.name+" : "+shareValue +"\n");
        }
    }

    public void getStockDetails() {
        System.out.println("Enter name of Stock");
        String stockName = Utility.readString();
        for (StockAccountModel item : stockList){
            if (item.name.equals(stockName)){
                System.out.println(item);
                int shareValue = item.numberOfShares * item.price;
                System.out.println("Total share value : "+shareValue);
            }
        }
    }

    public void buyShare() {
        System.out.println("Enter name of the company you want to buy shares of");
        String name = Utility.readString();
        for (StockAccountModel item : stockList){
            if (item.name.equals(name)){
                System.out.println("Enter number of shares to buy");
                int sharesNo = Utility.readInteger();
                item.numberOfShares += sharesNo;
                System.out.println(item);
            }
        }
    }

    public void sellShares() {
        System.out.println("Enter name of the company you want to sell shares of");
        String name = Utility.readString();
        for (StockAccountModel item : stockList){
                if (item.name.equals(name)){
                    System.out.println("Enter number of shares to sell");
                    int sharesNo = Utility.readInteger();
                        if (sharesNo > item.numberOfShares){
                            System.out.println("you have only "+item.numberOfShares+" shares to sell");
                            System.out.println("Try again");
                        }
                        else {
                            item.numberOfShares -= sharesNo;
                        }
                    System.out.println(item);
                }
        }
    }
}
