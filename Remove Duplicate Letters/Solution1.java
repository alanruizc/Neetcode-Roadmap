public class Solution1 {
    public String removeDuplicateLetters(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int[] lastInd = new int[26];
        for (int i = 0; i < n; i++) {
            lastInd[charArray[i] - 'a'] = i;
        }
        int inStackMask = 0;
        char[] stack = new char[26];
        int top = 0;
        for (int i = 0; i < n; i++) {
            char c = charArray[i];
            int currIdx = c - 'a';
            if ((inStackMask & (1 << currIdx)) != 0) {
                continue;
            }
            while (top > 0) {
                char topChar = stack[top - 1];
                int topIdx = topChar - 'a';
                if (c < topChar && i < lastInd[topIdx]) {
                    inStackMask &= ~(1 << topIdx);
                    top--;
                } else {
                    break;
                }
            }
            stack[top++] = c;
            inStackMask |= (1 << currIdx);
        }
        return new String(stack, 0, top);
    }
}