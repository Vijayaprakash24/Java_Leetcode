class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> arr=new HashMap<>();
    
        for(int num:nums){
            if(arr.containsKey(num)){
                arr.put(num,arr.get(num)+1);
            }else{
                arr.put(num,1);
            }
        }
       
        ArrayList<Integer> list = new ArrayList<>(arr.keySet());
        Collections.sort(list, (a, b) -> arr.get(b) - arr.get(a));
       
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i);
        }
        return ans;
     
    }
}