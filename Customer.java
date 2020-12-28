package StocksInvestorPortfolio;

import java.util.ArrayList;

public class Customer
{
    //private static String customerName = "Neetu";
    private String customerName;
    private ArrayList<PurchaseStock> purchaseStock;

    public Customer(String customerName, ArrayList<PurchaseStock> purchaseStock) {
        this.customerName = customerName;
        this.purchaseStock = purchaseStock;
    }

    public Customer()
    {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<PurchaseStock> getPurchaseStock() {
        return purchaseStock;
    }

    public void setPurchaseStock(ArrayList<PurchaseStock> purchaseStock) {
        this.purchaseStock = purchaseStock;
    }

}
