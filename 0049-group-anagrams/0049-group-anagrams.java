class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new LinkedHashMap<>();

		for (int i = 0; i < strs.length; i++) {
			int[] frequencies = new int[26];
			char[] chrs = strs[i].toCharArray();

			for (char ch: chrs) {
				frequencies[ch - 'a']++;
			}

			StringBuilder sb = new StringBuilder();
			for (int frequency: frequencies) {
				sb.append(frequency);
				sb.append('#');
			}

			String key = sb.toString();
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}

			map.get(key).add(strs[i]);
		}

		return new ArrayList<>(map.values());
    }
}