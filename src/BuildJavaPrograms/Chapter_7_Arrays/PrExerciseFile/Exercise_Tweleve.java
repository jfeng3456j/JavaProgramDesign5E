package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class Exercise_Tweleve {

    public static void main(String[] args) {
        String question = "Write a method called priceIsRight that mimics the guessing rules from the game show The Price Is Right. The\n" +
                "method accepts as parameters an array of integers representing the contestants’ bids and an integer representing a\n" +
                "correct price. The method returns the element in the bids array that is closest in value to the correct price without\n" +
                "being larger than that price. For example, if an array called bids stores the values [200, 300, 250, 1, 950, 40],\n" +
                "the call of priceIsRight(bids, 280) should return 250, since 250 is the bid closest to 280 without going over\n" +
                "280. If all bids are larger than the correct price, your method should return –1.";

        int[] bids = {200, 300, 250, 1, 950, 40,90,100,160,400,278};

        int priceIsRight = findRightPrice(bids, 280);

        System.out.println("the closes price in the bids is " + priceIsRight);
    }

    private static int findRightPrice(int[] bids, int rightPrice ) {
        if (bids.length < 1) return -1;

        int price = 0;
        for(int i = 0; i < bids.length; i++) {

            if (bids[i] <= rightPrice) {
                price = Math.max(price, bids[i]);
            }

        }

        return price != 0 ? price : -1;
    }
}
