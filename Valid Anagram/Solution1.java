import java.util.Arrays;

public class Solution1 {

        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()){
                return false;
            }


            char[] sortS = s.toCharArray();
            char[] sortT = t.toCharArray();

            Arrays.sort(sortS);
            Arrays.sort(sortT);

            return Arrays.equals(sortS, sortT);

        }
}
