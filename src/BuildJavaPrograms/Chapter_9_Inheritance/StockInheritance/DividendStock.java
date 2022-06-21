package BuildJavaPrograms.Chapter_9_Inheritance.StockInheritance;

import java.util.Objects;

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

    //override
    public double getProfit(double currentPrice) {
        return super.getProfit(currentPrice) + dividends;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DividendStock that = (DividendStock) o;
        return Double.compare(that.dividends, dividends) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dividends);
    }
}
