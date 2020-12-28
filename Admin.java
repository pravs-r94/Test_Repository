package StocksInvestorPortfolio;

import java.util.ArrayList;
import java.util.Scanner;
enum Category {
    AUTO, IT;
}

public class Admin
{
Category sCategory;
    public static ArrayList<Stock> addStocks()
    {
        ArrayList<Stock> stocks = new ArrayList<>();
        stocks.add(0, new Stock("Apple", 12.53, "AP", Category.IT.name(), 20));
        stocks.add(1, new Stock("Tesla", 11.3, "GO", Category.AUTO.name(), 25));
        stocks.add(2, new Stock("Facebook", 10.53, "FB", Category.IT.name(), 26));
        stocks.add(3, new Stock("RangeRover", 12.3, "RR", Category.AUTO.name(), 29));
        stocks.add(4, new Stock("Microsoft", 12.13, "MS", Category.IT.name(), 23));
        return stocks;
    }
    public static void viewStocks(ArrayList<Stock> stocks)
    {
        Scanner scn2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Category of the Stock");
        String entry = scn2.nextLine();
        // boolean found = false;

        for (int i = 0; i < stocks.size(); i++)
        {
            if (stocks.get(i).getsCategory().equals(entry))
            {
                System.out.println("Stock Name: " + stocks.get(i).getsFullName() + "\nAverage Price: " + stocks.get(i).getsAvgPrice() + "\nUnique Code: " + stocks.get(i).getsUniqueCode() + "\nCategory: " + stocks.get(i).getsCategory());
                //found= true;
                System.out.println("---------------------------------");
            }

        }

   /*         if(!found)
            {

            }
*/ }

}
