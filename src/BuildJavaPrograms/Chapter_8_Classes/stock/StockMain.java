package BuildJavaPrograms.Chapter_8_Classes.stock;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class StockMain {

    public static void main (String[] args) {

        //prompt for stock symbol, purchases, cost
        //print the profit/loss
        //compare two total profits/losses

        Scanner input = new Scanner(System.in);

        System.out.println("How many the number of company stock purchased");

        try {
            int purchases = Integer.parseInt(input.next());
            Stock[] stocks = new Stock[purchases];




            for(int i = 0; i < purchases; i++) {
                System.out.println("Enter stock symbol");
                String symbol = input.next();
                stocks[i] = new Stock(symbol);
                makePurchases(stocks[i], input);
            }

            //compare profit/loss

            if (stocks.length < 2) {
                System.out.println(stocks[0].getSymbol() + "is the only stock");
                return;
            }

            for(int i = 0; i < stocks.length - 1; i++) {
                if (stocks[i].getProfit() < stocks[i+1].getProfit()) {
                    System.out.println(stocks[i+1].getSymbol() + " is more profitable");
                } else {
                    System.out.println(stocks[i].getSymbol() + " is more profitable");
                }
            }


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }


    private static void makePurchases(Stock stock, Scanner input) {
        System.out.println("Enter the number of purchases of the stock");

        int numPurchases = input.nextInt();

        for (int i = 0; i < numPurchases; i++) {
            System.out.println( i + ": How many shares, at what price per share? ");

            int shares = input.nextInt();
            double pricePerShares = input.nextDouble();

            stock.purchase(shares, pricePerShares);
        }

        System.out.println("Enter the current market price");
        double currPrice = input.nextDouble();

        stock.getProfit(currPrice);

        System.out.println(stock.getProfit());
    }
}
