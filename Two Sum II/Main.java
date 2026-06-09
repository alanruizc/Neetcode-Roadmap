import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + " numbers (sorted):");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("Your sorted array looks like this: " + Arrays.toString(nums));

        System.out.print("Enter the target sum: ");
        int target = in.nextInt();
        int[] result = sol.twoSum(nums, target);

        System.out.println();
        if (result[0] != -1) {
            System.out.println("Solution found");
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

            int val1 = nums[result[0] - 1];
            int val2 = nums[result[1] - 1];
            System.out.println("Numbers: " + val1 + " + " + val2 + " = " + target);
        } else {
            System.out.println("Couldn't find two numbers that add up to the target");
        }

        in.close();
    }
}