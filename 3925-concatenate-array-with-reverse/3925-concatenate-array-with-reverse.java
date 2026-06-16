class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr=new int[nums.length+nums.length];
        int i=nums.length-1;
        for(int j=0;j<nums.length;j++){
            arr[j]=nums[j];
        }
        for(int j=nums.length;j<arr.length;j++){
            arr[j]=nums[i];
            i--;
        }
        return arr;
    }
}