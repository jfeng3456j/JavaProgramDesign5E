package BuildJavaPrograms.Chapter_9_Inheritance.CaseStudy;

public class DividendStock extends Stock {

    private double dividends;

    public DividendStock(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        dividends = 0.0;
    }

    public double getMarketValue() {
        //super is the Stock, we are overriden stock getMarketValue method.super is needed
        return super.getMarketValue() + dividends;
    }

    public void payDividend(double amtPerShare) {
        dividends += amtPerShare * getTotalShares();
    }
}
