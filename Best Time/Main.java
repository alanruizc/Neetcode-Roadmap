import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.print("Enter the number of days (array size): ");
        int days = in.nextInt();

        int[] prices = new int[days];

        System.out.println("Enter the stock price for each of the " + days + " days:");
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            prices[i] = in.nextInt();
        }

        int profit = sol.maxProfit(prices);

        System.out.println("Stock Price History: " + Arrays.toString(prices));

        if (profit > 0) {
            System.out.println("Maximum potential profit: $" + profit);
        } else {
            System.out.println("Maximum potential profit: $0. Better not to buy.");
        }

        in.close();
    }
}