public class Solution1 {
    public String removeDuplicateLetters(String s) {
        int[] lastInd = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastInd[s.charAt(i) - 'a'] = i;
        }

        boolean[] inStack = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int currIdx = c - 'a';

            if (inStack[currIdx]) {
                continue;
            }

            while (sb.length() > 0) {
                char topChar = sb.charAt(sb.length() - 1);
                int topIdx = topChar - 'a';
                if (c < topChar && i < lastInd[topIdx]) {
                    inStack[topIdx] = false; // Mark it as removed
                    sb.deleteCharAt(sb.length() - 1); // pop()
                } else {
                    break;
                }
            }
            sb.append(c);
            inStack[currIdx] = true;
        }
        return sb.toString();
    }
}