class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
			return false;
		}

		int[] frequency = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				frequency[ch - 'a']++;
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				frequency[ch - 'a']--;
			}
		}

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != 0) {
				return false;
			}
		}

        return true;
    }
}