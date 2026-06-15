class Solution {
    public String customSortString(String order, String s) {
        String str="";
        for(char st:order.toCharArray()){
            for(char c:s.toCharArray()){
                if(c==st){
                str+=c;}
            }
        }
        for(char c:s.toCharArray()){
            if(!order.contains(String.valueOf(c))){
                str+=c;
            }
        }
        return str;
    }
}