import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        int totalSum = 0;

        for (int k : divisors) {
            if (isSortable(nums, n, k)) {
                totalSum += k;
            }
        }

        return totalSum;
    }

    private boolean isSortable(int[] nums, int n, int k) {
        int numBlocks = n / k;
        int prevBlockMax = Integer.MIN_VALUE;

        for (int b = 0; b < numBlocks; b++) {
            int start = b * k;

            if (k == 1) {
                if (nums[start] < prevBlockMax) {
                    return false;
                }
                prevBlockMax = nums[start];
                continue;
            }

            int dropCount = 0;
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < k; i++) {
                int curr = nums[start + i];
                int next = nums[start + (i + 1) % k];

                if (curr > next) {
                    dropCount++;
                }

                if (curr < minVal) minVal = curr;
                if (curr > maxVal) maxVal = curr;
            }

            if (dropCount > 1) {
                return false;
            }

            if (minVal < prevBlockMax) {
                return false;
            }

            prevBlockMax = maxVal;
        }

        return true;
    }
}