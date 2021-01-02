package StocksInvestorPortfolio;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

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
    public static void viewStocks(ArrayList<Stock> stocks) {
        Scanner scn = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Category of the Stock");
        String entry = scn.nextLine();
        // boolean found = false;

        for (int i = 0; i < stocks.size(); i++) {
            if (stocks.get(i).getsCategory().equals(entry)) {
                System.out.println("Stock Name: " + stocks.get(i).getsFullName() + "\nAverage Price: " + stocks.get(i).getsAvgPrice() + "\nUnique Code: " + stocks.get(i).getsUniqueCode() + "\nCategory: " + stocks.get(i).getsCategory());
                //found= true;
                System.out.println("---------------------------------");
            }

        }
    }
    public static void searchStocks(ArrayList<Stock> stocks)
    {
        for(int i=0;i<2;i++)
        {
            Scanner scn = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter action to be performed: (Enter 1 2 or 3)\n 1.Stocks which have  \"ho\" in the name\n" + "2.Stocks which starts with H and ends with A\n" + "3.Stocks which has exact number of letters\n");
            int action = scn.nextInt();
            if (action==1)
            {
                for (int j = 0; j < stocks.size(); j++)
                if(Pattern.matches(".*ho.*", stocks.get(j).getsFullName())) {
                    System.out.println(stocks.get(j).getsFullName());

                }
            }
            if (action==2)
            {
                for (int j = 0; j < stocks.size(); j++)
                    if(Pattern.matches("^H.*A$", stocks.get(j).getsFullName())) {
                        System.out.println(stocks.get(j).getsFullName());
                    }
            }
            if (action==3)
            {
                int k = 0;
                /*Scanner scn1 = new Scanner(System.in);  // Create a Scanner object
                */System.out.println("Enter the number of characters you want to search in the stock name");
                int charCount = scn.nextInt();

                for (int j = 0; j < stocks.size(); j++)
                {
                    if (Pattern.matches("^[a-zA-Z]{"+charCount+"}", stocks.get(j).getsFullName())) {

                        System.out.println(stocks.get(j).getsFullName());
                        k++;

                    }

                }

                if(k==0)
                {
                    System.out.println("No matches found");
                }
            }


        }

    }
   /*         if(!found)
            {

            }
*/

}
