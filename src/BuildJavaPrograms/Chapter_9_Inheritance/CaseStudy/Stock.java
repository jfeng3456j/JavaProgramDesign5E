package BuildJavaPrograms.Chapter_9_Inheritance.CaseStudy;

public class Stock extends ShareAsset implements Asset {

    private int totalShares;

    public Stock (String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0;
    }

    public double getTotalShares() {
        return totalShares;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrrentPrice();
    }

    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares + pricePerShare);
    }


}
