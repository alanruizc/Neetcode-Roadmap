import java.util.HashSet;

public class Solution1 {

        public boolean hasDuplicate(int[] nums){
           /* for (int i = 0; i < nums.length; i++){
                for (int j = i + 1; j < nums.length; j++){
                    if (nums [i] == nums [j]){
                        return true;
                    }

                }

            }
            return false;
*/


            HashSet<Integer> seen = new HashSet<>();
            for (int i : nums) {
                if (seen.contains(i)){
                    return true;
                }
                seen.add(i);
            }

            return false;
    }



}
