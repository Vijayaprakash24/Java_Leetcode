class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int key : set) {
            if (!set.contains(key - 1)) { 
                int count = 1;
                int curr = key + 1;
                while (set.contains(curr)) {
                    count++;
                    curr++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}