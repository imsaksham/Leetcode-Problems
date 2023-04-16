class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int max = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > max) {
                max = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return max;
    }
}