import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // try-with-resources automatically closes the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nEnter space-separated integers (or enter 'exit' to quit):");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Bye!");
                    break;
                }

                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty.");
                    continue;
                }

                try {
                    int[] nums = Arrays.stream(input.split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();

                    int result = solution.sortableIntegers(nums);

                    System.out.println("Input Array : " + Arrays.toString(nums));
                    System.out.println("Output      : " + result);

                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid integers separated by spaces");
                }
            }
        }
    }
}