class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int y = target - nums[i];

            if (map.containsKey(y)) {
                arr[0] = map.get(y);
                arr[1] = i;
                return arr;
            }
            else {
                map.put(nums[i], i);
            }
        }

        return arr;
    }
}