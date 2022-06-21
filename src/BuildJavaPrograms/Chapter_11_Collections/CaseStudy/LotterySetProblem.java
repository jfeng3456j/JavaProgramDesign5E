package BuildJavaPrograms.Chapter_11_Collections.CaseStudy;

import java.util.*;

public class LotterySetProblem {

    public static final int NUMBER = 6;
    public static final int MAX_NUMBER = 40;

    public static void main (String[] args) {

        Set<Integer> winNum = createWinningNum();
        Set<Integer> ticket = getTicket();

        System.out.println("Your ticket was: " + ticket);
        System.out.println("Winning ticket was: " + winNum);

        Set<Integer> matches = new TreeSet<>(ticket);
        System.out.println("matches: " + matches);
        matches.retainAll(winNum);

        if (matches.size() > 0) {
            double prize = 100 * Math.pow(2, matches.size());
            System.out.printf("Match numbers are %s \n", matches);
            System.out.printf("Prize amount is %.2f", prize);
        } else {
            System.out.println("you didn't win");
        }
    }

    public static Set<Integer> createWinningNum() {
        Set<Integer> winningNum = new HashSet<>();
        Random ran = new Random();

        while (winningNum.size() < 6) {
            int num = ran.nextInt(MAX_NUMBER) + 1; // 1 -41
            winningNum.add(num);
        }
        return winningNum;
    }

    private static Set<Integer> getTicket() {
        Scanner input = new Scanner(System.in);
        Set<Integer> ticket = new TreeSet<>();
        System.out.print("Type " + NUMBER + " lotto numbers: ");
        while (ticket.size() < NUMBER) {
            int ticketNum = input.nextInt();
            ticket.add(ticketNum);
        }
        return ticket;
    }
}
