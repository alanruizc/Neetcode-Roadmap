import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();
        System.out.println("Remove Duplicate Letters");
        System.out.print("enter s(string): ");
        String s = in.nextLine();
        String result = sol.removeDuplicateLetters(s);
        System.out.println("input: " + s);
        System.out.println("output:  " + result);
        in.close();
    }
}