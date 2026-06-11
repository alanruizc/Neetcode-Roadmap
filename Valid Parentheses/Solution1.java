import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution1 {
    public boolean isValid(String s) {
        Map<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (hm.containsValue(c)) {
                stack.push(c);
            } else if (hm.containsKey(c)) {
                if (stack.isEmpty() || hm.get(c) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}