package BuildJavaPrograms.Chapter_9_Inheritance.StockInheritance;

public class DividendStock extends Stock {

    private double dividends;

    public DividendStock(String symbol) {
        //using super to call the stock constructor, which
        //initialize symbol, totalcost, and totalshare
        super(symbol);
        dividends = 0.0;
    }

    public void payDividend(double amountPerShare) {
        dividends += amountPerShare * getTotalShares();
    }

    public double getProfit(double currentPrice) {
        return super.getProfit(currentPrice) + dividends;
    }
}
