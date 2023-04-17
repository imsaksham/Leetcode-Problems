class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        hashMap.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int y = target - nums[i];

            if (hashMap.containsKey(y)) {
                arr[0] = hashMap.get(y);
                arr[1] = i;
                return arr;
            }

            else {
                hashMap.put(nums[i], i);
            }
        }

        return arr;
    }
}