class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solve(nums,new boolean[nums.length],new ArrayList<>());
        return ans;
    }
    void solve(int[] nums,boolean[] vis,List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue;
            vis[i]=true;
            list.add(nums[i]);
            solve(nums,vis,list);
            list.remove(list.size()-1);
            vis[i]=false;
        }
    }
}