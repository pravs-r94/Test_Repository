package Stocks;

//to calculate if the stock is worth buying today
public class StocksSuggest
{

    public void suggest(double todayPrice, double[] weeklyPrices)
    {
        int noOfDays = weeklyPrices.length;
        float sum = 0;
        //finding the avg stock price for last week
        for (int i = 0; i < noOfDays; i++)
        {
            sum += weeklyPrices[i];
        }
        float avg = sum / noOfDays;
        System.out.println("Avg stock price for last week is :" + avg);
        //Pass or choose suggestion
        if(todayPrice<avg)
            System.out.println("Stock is worth buying!");
        else
            System.out.println("Stock is not worth buying!");
    }

}