package StocksInvestorPortfolio;

import java.util.Objects;

public class Stock
{
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

    @Override
    public int hashCode() {
        return Objects.hash(sName, productType, price);
    }

    private String sName;
    private String productType;
    private double price;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}