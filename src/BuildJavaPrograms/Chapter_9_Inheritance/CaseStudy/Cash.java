package BuildJavaPrograms.Chapter_9_Inheritance.CaseStudy;

public class Cash implements Asset{
    private double cashAmt;

    public Cash(double cashAmt) {
        this.cashAmt = cashAmt;
    }

    @Override
    public double getMarketValue() {
        return cashAmt;
    }

    @Override
    public double getProfit() {
        return 0.0;
    }

    public void setCashAmt(double cashAmt) {
        this.cashAmt = cashAmt;
    }
}
