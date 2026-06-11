import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.print("Enter a bracket sequence (for example {[]}()): ");
        String s = in.nextLine();
        boolean result = sol.isValid(s);

        System.out.println();
        if (result) {
            System.out.println("Result: \"" + s + "\" Valid. Every bracket closes properly.");
        } else {
            System.out.println("Result: \"" + s + "\" Not valid. The brackets are mismatched/improperly nested.");
        }

        in.close();
    }
}