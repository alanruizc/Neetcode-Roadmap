import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.print("Enter your first word: ");
        String s = in.nextLine();
        System.out.print("Enter your second word: ");
        String t = in.nextLine();

        boolean result = sol.isAnagram(s, t);

        if (result) {
            System.out.println("Your words are anagrams");
        } else {
            System.out.println("Your words are not anagrams");
        }

        in.close();
    }
}