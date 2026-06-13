class Solution {
    public boolean isPalindrome(int x) {
        boolean flag=false;
        int num=x;
        int rev=0;
        while(num!=0&&x>0){
            rev=rev*10+num%10;
            num=num/10;
        }
     
        flag=x==rev?true:false;
        return flag;
        
    }
}