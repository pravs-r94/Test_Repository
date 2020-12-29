package StocksInvestorPortfolio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CustomerHelper
{
    Customer portfolio;
   static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    public static ArrayList<Customer> mockData() throws ParseException
    {
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<PurchaseStock> neethuStocks = new ArrayList<>();
        ArrayList<PurchaseStock> gouthuStocks = new ArrayList<>();
        neethuStocks.add(0, new PurchaseStock("Apple", 5, 12.53, sdf.parse("12/25/2020")));
        neethuStocks.add(1, new PurchaseStock("Tesla", 5, 11.3, sdf.parse("12/25/2020")));
        gouthuStocks.add(0,new PurchaseStock("Apple", 5, 12.53, sdf.parse("12/25/2020")));
        gouthuStocks.add(1, new PurchaseStock("Tesla", 5, 11.3, sdf.parse("12/25/2020")));
        Customer neethuPortfolio = new Customer("Neethu", neethuStocks);
        Customer gouthuPortfolio = new Customer("Gouthu", gouthuStocks);
        customers.add(neethuPortfolio);
        customers.add(gouthuPortfolio);
        return customers;
    }
    public static Customer buyStocks(ArrayList<Stock> stocks, String cName, Date date, Customer customer)
    {
        ArrayList<PurchaseStock> purchaseStocks = new ArrayList<>();
        Scanner cStockName = new Scanner(System.in);
        System.out.println("Enter Stock Name");
        String stockName = cStockName.nextLine();
        for (int i = 0; i < stocks.size(); i++)
        {

            if (stocks.get(i).getsFullName().equals(stockName))
            {
                Scanner cStockUnits = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Available Stocks : " + stocks.get(i).getQty());
                System.out.println("Enter number of stocks you want to purchase");
                int stockUnits = cStockUnits.nextInt();

                if (stocks.get(i).getQty() > stockUnits)
                {
                    PurchaseStock purchaseStock = new PurchaseStock(stockName, stockUnits, stocks.get(i).getsAvgPrice(), date);

                    if(customer.getPurchaseStock().isEmpty())
                    {
                        purchaseStocks.add(purchaseStock);
                        customer.setCustomerName(cName);
                        customer.setPurchaseStock(purchaseStocks);

                    }

                    else
                    {
                        ArrayList<PurchaseStock> existingStocks = customer.getPurchaseStock();
                        ArrayList<PurchaseStock> updatedStocks = new ArrayList<>();
                        for(PurchaseStock existingStock: existingStocks)
                        {
                            updatedStocks.add(existingStock);

                        }
                        updatedStocks.add(purchaseStock);
                        customer.setCustomerName(cName);
                        customer.setPurchaseStock(updatedStocks);

                    }
                        System.out.println("Your " + stockName + " stock has been added successfully");
                    stocks.get(i).setQty(stocks.get(i).getQty() - stockUnits);
                        System.out.println("Remaining stocks for " + stockName + ":" + stocks.get(i).getQty());
                }
            }

        }
        return customer;
    }
    public static void viewPortfolio(Customer customer)
    {
        for(PurchaseStock purchaseStock : customer.getPurchaseStock())
        {
                System.out.println(customer.getCustomerName() + " Portfolio:\n" + "Stock Name: " + purchaseStock.getsFullName() +
                        "\nStock Qty: " + purchaseStock.getQty());

        }

    }
    public void searchPortfolio(Customer mockCustomer) throws ParseException
    {
        for(int i=0; i<mockCustomer.getPurchaseStock().size(); i++)
        {
            Scanner cEntry = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please enter a date in format mm/dd/yyyy: ");
            String entryDate = cEntry.nextLine();
            Date eDate=sdf.parse(entryDate);

            if(eDate.compareTo(mockCustomer.getPurchaseStock().get(i).getPurchaseDate())>=0)
            {
                System.out.println(mockCustomer.getCustomerName() + " Portfolio:\n" + "Stock Name: " + mockCustomer.getPurchaseStock().get(i).getsFullName() +
                        "\nStock Qty: " + mockCustomer.getPurchaseStock().get(i).getQty() + "\nStock purchase date: " + mockCustomer.getPurchaseStock().get(i).getPurchaseDate());
            }
        }
    }


}
