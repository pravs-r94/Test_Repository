package IOStreams;
/*
import StocksInvestorPortfolio.Stock;
import StocksInvestorPortfolio.Admin;

import StocksInvestorPortfolio.MainFlow;
*/
import StocksInvestorPortfolio.Customer;
import StocksInvestorPortfolio.CustomerHelper;
import StocksInvestorPortfolio.PurchaseStock;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

public class IOStream {
    public static void main(String args[]) throws IOException, ParseException {
       try {
            CustomerHelper customerHelper = new CustomerHelper();
            ArrayList<Customer> customerList = customerHelper.mockData();

            for (int i = 0; i < customerList.size(); i++)
            //for (Customer c: customerList)
            {
                int j=i+1;
                FileOutputStream f = new FileOutputStream(new File("Customer"+ j +".txt"));
                ObjectOutputStream o= new ObjectOutputStream(f);
                o.writeObject(customerList.get(i));
                o.close();
                f.close();

            }
            System.out.println("File generated Successfully");
            //inputStream

           HashMap<String, ArrayList<PurchaseStock>> customers = new HashMap<>();
          // ArrayList<Customer> customers = new ArrayList<>();
           for (int i = 0; i < customerList.size(); i++)
           {
               int j=i+1;
               FileInputStream fi = new FileInputStream(new File("Customer"+ j +".txt"));
               ObjectInputStream oi = new ObjectInputStream(fi);
               Customer customer =(Customer) oi.readObject();
               customers.put(customer.getCustomerName(),customer.getPurchaseStock());
               oi.close();
               fi.close();
           }
           System.out.println("File read Successfully");


           System.out.println("Saved Data");
           for (String name: customers.keySet()){
               String key = name.toString();
               String value = customers.get(name).toString();
               System.out.println(key + " " + value);
           }
            System.out.println(customers.get("Neethu"));
           System.out.println(customers.get("Gouthu").toString());


          /* for(int i=0; i<customers.size(); i++)
            {
                ArrayList<PurchaseStock> p1 = customers.get(i);
                for(int j=0; j<p1.size(); j++)
                {

                    System.out.println(customers.get(p1));
                }
            }

*/
            }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();

        }
       }
}
