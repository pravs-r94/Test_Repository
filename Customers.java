
package Threads;

import StocksInvestorPortfolio.Customer;
import StocksInvestorPortfolio.PurchaseStock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Customers extends Thread
{
    ArrayList<Customer> customers = new ArrayList<>();

    static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    public  ArrayList<Customer> myCustomers() throws ParseException
    {
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

}
class Customer1 extends Customers
{
    @Override
    public void run()
    {
        try {
            myCustomers();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Thread" + Thread.currentThread().getId() + "Customer data: \n"+customers.get(0) );

    }
}
class Customer2 extends Customers
{
    @Override
    public void run()
    {
        try {
            myCustomers();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Thread" + Thread.currentThread().getId() + "Customer data: \n"+customers.get(1));
    }
}


