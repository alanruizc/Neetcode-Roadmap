public class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k == 0 && isSortable(nums, n, k)) {
                totalSum += k;
            }
        }

        return totalSum;
    }

    private boolean isSortable(int[] nums, int n, int k) {
        int prevBlockMax = Integer.MIN_VALUE;

        for (int start = 0; start < n; start += k) {
            int dropCount = 0;
            int minVal = nums[start];
            int maxVal = nums[start];

            for (int i = 0; i < k; i++) {
                int curr = nums[start + i];
                int next = nums[start + (i + 1) % k];

                if (curr > next) {
                    dropCount++;
                }
                if (curr < minVal) {
                    minVal = curr;
                }
                if (curr > maxVal) {
                    maxVal = curr;
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