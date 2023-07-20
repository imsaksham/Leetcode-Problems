class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            }
            else {
                map.put(num, 1);
            }
        }

        for (int key: map.keySet()) {
            if (map.get(key) > 1) {
                return key;
            }
        }

        return -1;
    }
}