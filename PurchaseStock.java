package StocksInvestorPortfolio;

import java.text.SimpleDateFormat;

public class PurchaseStock
{
    private String sFullName;
    private int qty;
    private  double sAvgPrice;
    private SimpleDateFormat purchaseDate;

    public PurchaseStock()
    {
    }

    public PurchaseStock(String sFullName, int qty, double sAvgPrice, SimpleDateFormat purchaseDate) {
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

    public SimpleDateFormat getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(SimpleDateFormat purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }
}
