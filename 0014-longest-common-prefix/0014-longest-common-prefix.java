class Solution {
    public String longestCommonPrefix(String[] strs) {

        String str = strs[0];
        String ans = "";
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
                    return ans;
                }
            }
            ans += c;
        }
        return ans;
    }
}