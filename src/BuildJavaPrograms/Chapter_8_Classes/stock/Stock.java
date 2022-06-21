package BuildJavaPrograms.Chapter_8_Classes.stock;

public class Stock {

    //stock symbol
    //accumulated stock purchaese
    //record purchase of the stock
    //compute profit/losses

    private String symbol;
    private int totalShares;
    private double totalCost;
    private double profit;

    public Stock (String symbol) {

        if (symbol == null) {
            throw new IllegalArgumentException();
        }

        this.symbol = symbol;
        totalShares = 0;
        totalCost = 0.0;
        profit = 0.0;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getProfit() {
        return profit;
    }

    public void getProfit (double currentPrice) {

        if (currentPrice < 0.0) {
            throw new IllegalArgumentException();
        }
        profit = (currentPrice * totalShares) - totalCost;
    }

    public void purchase (int shares, double pricePerShare) {

        if (shares < 0 || pricePerShare < 0.0){
            throw new IllegalArgumentException();
        }

        totalShares += shares;
        totalCost = totalShares * pricePerShare;
    }


    @Override
    public String toString() {
        return "symbol: " + symbol + " total shares: " + totalShares + " total cost: " + totalCost;
    }
}
