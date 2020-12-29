package StocksInvestorPortfolio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PurchaseStock implements Serializable
{
    private String sFullName;
    private int qty;
    private  double sAvgPrice;
    private Date purchaseDate;

    @Override
    public String toString() {
        return "PurchaseStock{" +
                "sFullName='" + sFullName + '\'' +
                ", qty=" + qty +
                ", sAvgPrice=" + sAvgPrice +
                ", purchaseDate=" + purchaseDate +
                '}';
    }

    public PurchaseStock()
    {
    }

    public PurchaseStock(String sFullName, int qty, double sAvgPrice, Date purchaseDate) {
        this.sFullName = sFullName;
        this.qty = qty;
        this.sAvgPrice = sAvgPrice;
        this.purchaseDate = purchaseDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getsAvgPrice() {
        return sAvgPrice;
    }

    public void setsAvgPrice(double sAvgPrice) {
        this.sAvgPrice = sAvgPrice;
    }

    public String getsFullName() {
        return sFullName;
    }

    public void setsFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
