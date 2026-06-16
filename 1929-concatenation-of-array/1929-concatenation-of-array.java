class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length+nums.length;
        int[] arr=new int[len];
        int i=0;
         for(int j=0;j<nums.length;j++){
                arr[j]=nums[j];

            }
            for( int j=nums.length;j<arr.length;j++){
                arr[j]=nums[i++];

            }
            return arr;
        
    }
}