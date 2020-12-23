package StocksInvestorPortfolio;

import java.util.Objects;

public class Stock
{
    /*
    @Override
    public String toString() {
        return "Stock{" +
                "sName='" + sName + '\'' +
                ", productType='" + productType + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.price, price) == 0 && Objects.equals(sName, stock.sName) && Objects.equals(productType, stock.productType);
    }

    */
    private String sName;
    private double price;
    public Stock()
    {

    }
    public Stock(String sName, double price) {
        this.sName = sName;
        this.price = price;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}