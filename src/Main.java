import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //Given an integer array nums, return true if any value appears
        // more than once in the array, otherwise return false.

        Scanner in = new Scanner(System.in);
        Solution1 cd = new Solution1();

        System.out.println("Please, enter the size of the array: ");
        int size = in.nextInt();

        int[] nums  = new int[size];

        System.out.println("Enter " +  size + " numbers: ");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

       boolean result = cd.hasDuplicate(nums);
        System.out.println("Your array contains duplicate numbers? " + result);
    }
}