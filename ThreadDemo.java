package Threads;

import StocksInvestorPortfolio.CustomerHelper;

import java.text.ParseException;

public class ThreadDemo
{
    public static void main(String[] args) throws ParseException
    {
        Customer1 customer1 = new Customer1();
      //  CustomerHelper customerHelper = new CustomerHelper();
        customer1.myCustomers();
        customer1.start();

        Customer2 customer2 = new Customer2();
        customer2.start();

    }
}
