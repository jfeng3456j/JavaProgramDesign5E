package BuildJavaPrograms.Chapter_9_Inheritance.CaseStudy;

public class MutualFund extends ShareAsset implements  Asset {

    private double totalShares;

    public MutualFund(String symbol, double currenPrice) {
        super(symbol,currenPrice);
        totalShares = 0.0;
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares + pricePerShare);
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrrentPrice();
    }

}
