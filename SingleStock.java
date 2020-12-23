package StocksInvestorPortfolio;
import java.util.Scanner;

public class SingleStock
{
    public void main(String[] args)
    {
        Stock[] stocks=setStocks();

        /*GrowthStock gs=new GrowthStock();
        gs.setIndicatorValue(1);
        gs.setsName("Apple");
        gs.setPrice(12.53);
        */

            Scanner scn = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter stock name");
            String entry = scn.nextLine();
            for (int i = 0; i < stocks.length; i++)
            {
                if (stocks[i].getsName().equals(entry)) {
                    System.out.println("Stock Name: " + stocks[i].getsName() + "\nPrice: " + stocks[i].getPrice());
                    break;
                } else {
                    System.out.println("Entry not found");
                    break;
                }
            }



    }
    public Stock[] setStocks()
    {
        Stock[] stocks= new Stock[5];
        stocks[0]=new Stock("Apple",12.53);
        stocks[1]=new Stock("Google",11.3);
        stocks[2]=new Stock("Facebook",10.53);
        stocks[3]=new Stock("Amazon",12.3);
        stocks[4]=new Stock("Sysco",12.13);
        return stocks;
    }
}
