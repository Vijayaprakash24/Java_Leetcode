class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length=m+n;
        int[] arr=new int[length];
        int i=0;
        while(i<m){
            arr[i]=nums1[i];
            i++;
        }
        int j=0;
        while(j<n){
            arr[i]=nums2[j];
            i++;
            j++;
        }
        
        Arrays.sort(arr);
        for(i=0;i<length;i++){
            nums1[i]=arr[i];
        }
        
        
    }
}