class Solution {
    public int lengthOfLongestSubstring(String s) {
        String k = "";
        int max = 0;

        for (char c : s.toCharArray()) {
            if (k.contains(Character.toString(c))) {
                int idx = k.indexOf(c);
                k = k.substring(idx + 1);
            }

            k += c;
            max = Math.max(max, k.length());
        }

        return max;
    }
}