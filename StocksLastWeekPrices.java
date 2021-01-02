package Stocks;


//storing last week prices of the stocks
public class StocksLastWeekPrices
{
    public static void main(String[] args)
    {
        double todayPrice=28;
        StocksSuggest s=new StocksSuggest();
        double[] weeklyPrices = {20.5, 22.25, 20.99, 25.64, 23.67, 22.83, 24.64};
        s.suggest(todayPrice,weeklyPrices);
    }
}
