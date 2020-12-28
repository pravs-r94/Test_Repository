package StocksInvestorPortfolio;

import java.util.Objects;

public class Stock
{
    private String sFullName;
    private double sAvgPrice;
    private  String sUniqueCode;
    private  String sCategory;
    private int qty;

    public Stock()
    {

    }
    public Stock(String sFullName, double sAvgPrice, String sUniqueCode, String sCategory, int qty)
    {
        this.sFullName = sFullName;
        this.sAvgPrice = sAvgPrice;
        this.sUniqueCode = sUniqueCode;
        this.sCategory = sCategory;
        this.qty = qty;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getsFullName()
    {
        return sFullName;
    }

    public void setsFullName(String sFullName)
    {
        this.sFullName = sFullName;
    }

    public double getsAvgPrice()
    {
        return sAvgPrice;
    }

    public void setsAvgPrice(double sAvgPrice)
    {
        this.sAvgPrice = sAvgPrice;
    }

    public String getsUniqueCode()
    {
        return sUniqueCode;
    }

    public void setsUniqueCode(String sUniqueCode)
    {
        this.sUniqueCode = sUniqueCode;
    }

    public String getsCategory()
    {
        return sCategory;
    }

    public void setsCategory(String sCategory)
    {
        this.sCategory = sCategory;
    }
}