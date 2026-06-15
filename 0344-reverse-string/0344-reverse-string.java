class Solution {
    public void reverseString(char[] s) {
        char[] an=new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            an[j]=s[i];
            j++;
        }
       for(int i=0;i<an.length;i++){
        s[i]=an[i];
       }
    }
}