package BuildJavaPrograms.Chapter_9_Inheritance.StockInheritance;

public class Stock {

    private String symbol;
    private int totalShares;
    private double totalCost;

    public Stock(String symbol) {
        this.symbol = symbol;
        totalShares =0;
        totalCost = 0.0;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public double getProfit(double currentPrice) {
        double marketValue = totalShares * currentPrice;
        return marketValue - totalCost;
    }

    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        totalCost = totalShares * pricePerShare;
    }
}
