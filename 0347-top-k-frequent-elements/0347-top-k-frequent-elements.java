class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> maps = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (!maps.containsKey(nums[i])) {
				maps.put(nums[i], 1);
			}
			else {
				maps.put(nums[i], maps.get(nums[i])+1);
			}
		}

		List<Integer>[] freq = new List[nums.length+1];
		for (int i = 0; i < freq.length; i++) {
			freq[i] = new ArrayList<>();
		}

		for (Map.Entry<Integer, Integer> map: maps.entrySet()) {
			freq[map.getValue()].add(map.getKey());
		}

		List<Integer> list = new ArrayList<>();
		for (int i = freq.length-1; i >= 0 && list.size() < k; i--) {
			for (int num: freq[i]) {
				list.add(num);
			}
			if (list.size() == k) {
				break;
			}
		}

        int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = list.get(i);
		}

        return result;
    }
}