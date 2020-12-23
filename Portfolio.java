
package StocksInvestorPortfolio;
public class Portfolio
{
    public static void main(String[] args)
    {
        SingleStock ss=new SingleStock();
        Stock[] stocks=ss.setStocks();

        int j=1;

        for (int i = 0; i < stocks.length; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("STOCK " + j + " DETAILS");
            j++;
            System.out.println("-------------------------------------------");
            System.out.println("Stock Name: " + stocks[i].getsName() + "\nPrice: " + stocks[i].getPrice());

        }
    }
}

/*
Stock name,price
        GrowthStock extends stock
            boolean indicatorValue
          DefesiveStock extends stock

          long marketCap
        Person
        Enum
        Portfolio -> array of stocks,Person name
                methods
                printPortfolio

        System.out.println("-------------------------------------------");
        System.out.println("STOCK NAME\t"+" PRODUCT TYPE\t"+" PRICE");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < p.sName.length; i++)
        {
            System.out.println(p.sName[i]+"\t"+p.productType[i]+"\t"+p.price[i]);

        }

          */


