package BuildJavaPrograms.Chapter_9_Inheritance.CaseStudy;

public abstract class ShareAsset implements Asset {
    private String symbol;
    private double totalCost;
    private double currrentPrice;

    public ShareAsset (String symbol, double currrentPrice) {
        this.symbol = symbol;
        totalCost = 0.0;
        this.currrentPrice = currrentPrice;
    }

    public void addCost(double cost) {
        totalCost += cost;
    }

    public double getTotalCost(){
        return totalCost;
    }

    public double getCurrrentPrice() {
        return currrentPrice;
    }

    public void setCurrrentPrice(double currrentPrice) {
        this.currrentPrice = currrentPrice;
    }

    public abstract double getMarketValue();

    public double getProfit() {
        // calls an abstract getMarketValue method
        // (the subclass will provide its implementation)
        return getMarketValue() - getTotalCost();
    }


}
