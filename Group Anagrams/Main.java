import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.print("Enter the number of words you want to enter");
        int size = in.nextInt();
        in.nextLine();

        String[] strs = new String[size];
        System.out.println("Enter " + size + " words:");
        System.out.println("Enter " + size + " words:");
        for (int i = 0; i < size; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            strs[i] = in.nextLine();
        }

        List<List<String>> result = sol.groupAnagrams(strs);
        System.out.println("\nGroups of Anagrams found:");
        for (List<String> group : result) {
            System.out.println(group);
        }

        in.close();
    }
}