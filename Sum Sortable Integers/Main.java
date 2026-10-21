import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        while (true) {
            System.out.println("\nenter space separated integers:");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty.");
                continue;
            }

            try {
                String[] tokens = input.split("\\s+");
                int[] nums = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    nums[i] = Integer.parseInt(tokens[i]);
                }

                int result = solution.sortableIntegers(nums);

                System.out.println("Input Array : " + Arrays.toString(nums));
                System.out.println("Output      : " + result);

            } catch (NumberFormatException e) {
                System.out.println("enter valid integers separated by spaces.");
            }
        }

        scanner.close();
    }
}