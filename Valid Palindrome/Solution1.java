public class Solution1 {
    public boolean isPalindrome(String s) {
        StringBuilder fxdString = new StringBuilder();

        // only keep alphnumeric characters converted to lowercase
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fxdString.append(Character.toLowerCase(c));
            }
        }

        String cleaned = fxdString.toString();
        int left = 0;
        int right = cleaned.length() - 1;

        // two pointer check
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}