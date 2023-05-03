class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);

        int prefixSum = 0;
        int count = 0;
        int x;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            x = prefixSum - k;
            if (hashMap.containsKey(x)) {
                count += hashMap.get(x);
            }
            hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum, 0) + 1); //getOrDefault means if the value of key (prefixSum) is already present then increment it by 1 else put default value i.e., 0.
        }

        return count;

        // int currSum = 0;
        // int count = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == k && nums.length == 1) {
        //         return 1;
        //     }
        //     if (nums[i] == k) {
        //         count++;
        //     }
        //     currSum += nums[i];

        //     if (currSum == k) {
        //         count++;
        //         currSum = 0;
        //         i = i-1;
        //     }
        //     else if (currSum > k) {
        //         currSum = 0;
        //     }
        //     else if (currSum < 0 && i > 0) {
        //         currSum -= nums[i-1];
        //     }
        // }

        // return count;
    }
}