public class Solution1 {
    public String removeDuplicateLetters(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int[] lastInd = new int[26];
        for (int i = 0; i < n; i++) {
            lastInd[charArray[i] - 'a'] = i;
        }

        boolean[] inStack = new boolean[26];

        char[] stack = new char[26];
        int top = 0;

        for (int i = 0; i < n; i++) {
            char c = charArray[i];
            int currIdx = c - 'a';

            if (inStack[currIdx]) {
                continue;
            }

            while (top > 0) {
                char topChar = stack[top - 1];
                int topIdx = topChar - 'a';

                if (c < topChar && i < lastInd[topIdx]) {
                    inStack[topIdx] = false;
                    top--;
                } else {
                    break;
                }
            }
            stack[top++] = c;
            inStack[currIdx] = true;
        }
        return new String(stack, 0, top);
    }
}