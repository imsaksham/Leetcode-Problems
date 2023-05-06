class Solution {
    public String reverseStr(String s, int k) {
        if (s.length() == 1) {
            return s;
        }
        
        char[] str = s.toCharArray();
        int n = str.length;

        for (int start = 0; start < n; start += 2*k) {
            int end = start + k - 1;

            if (end < n) {
                reverseStr(start, end, str);
            }
            else {
                reverseStr(start, n-1, str);
            }
        }

        String output = new String(str);

        return output;
    }

    public static void reverseStr(int start, int end, char[] str) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
    }
}