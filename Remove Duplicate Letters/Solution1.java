import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution1 {
    public String removeDuplicateLetters(String s) {
        int n = s.length();

        Map<Character, Integer> lastInd = new HashMap<>();
        for (int i = 0; i < n; i++) {
            lastInd.put(s.charAt(i), i);
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            }

            while (!stack.isEmpty() &&
                    c < stack.peek() &&
                    i < lastInd.get(stack.peek())) {
                stack.pop();
            }

            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}