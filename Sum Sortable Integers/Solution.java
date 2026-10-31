public class Solution {

    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for (int k = 1; k <= n; k++) {
            // check if k is a divisor and if the array is sortable with block size k
            if (n % k == 0 && isSortable(nums, k)) {
                totalSum += k;
            }
        }

        return totalSum;
    }

    private boolean isSortable(int[] nums, int k) {
        int prevBlockMax = Integer.MIN_VALUE;

        // process the array in chunks of size k
        for (int start = 0; start < nums.length; start += k) {
            int dropCount = 0;
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < k; i++) {
                int curr = nums[start + i];
                int next = nums[start + (i + 1) % k]; // wrap around to the start of the block

                minVal = Math.min(minVal, curr);
                maxVal = Math.max(maxVal, curr);
                if (curr > next) {
                    dropCount++;
                }
            }
            if (dropCount > 1 || minVal < prevBlockMax) {
                return false;
            }

            prevBlockMax = maxVal;
        }

        return true;
    }
}