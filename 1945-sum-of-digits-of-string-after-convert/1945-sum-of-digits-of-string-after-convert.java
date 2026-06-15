class Solution {
    public int getLucky(String s, int k) {
        
        String sum="";
        for(char c:s.toCharArray()){
            sum += (c - 'a' + 1);
            
        }
        int sum1=0;
        for(int i=0;i<k;i++){
            sum1=0;
            for(char c:sum.toCharArray()){
                sum1+=c-'0';
            }
            sum=String.valueOf(sum1);
        }
        return Integer.parseInt(sum);
        
    }
}