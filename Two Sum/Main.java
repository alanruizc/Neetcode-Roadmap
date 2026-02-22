import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = in.nextInt();
        int[] result = sol.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Solution found!");
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No two numbers were found that add up to the target.");
        }

        in.close();
    }
}