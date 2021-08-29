package StockModel;

public class StockAccountModel {
    public String name;
    public int price;
    public int numberOfShares;

    public StockAccountModel() {
    }

    public StockAccountModel(String name, int price, int numberOfShares) {
        this.name = name;
        this.price = price;
        this.numberOfShares = numberOfShares;
    }

    @Override
    public String toString() {
        return "StockAccountModel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", numberOfShares=" + numberOfShares +
                '}';
    }

}
