import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int actualNum = nums[i];
            int complementNum = target - actualNum;

            if(prevMap.containsKey(complementNum)){
                return new int[]{prevMap.get(complementNum), i};
            }

            prevMap.put(actualNum, i);
        }
        return new int[]{};

    }
}
