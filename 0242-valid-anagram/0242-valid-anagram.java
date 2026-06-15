class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        ArrayList<Character> arr=new ArrayList<>();
        ArrayList<Character> arr1=new ArrayList<>();

        for(char c:s.toCharArray()){
            arr.add(c);
        }
        for(char c1:t.toCharArray()){
            arr1.add(c1);
        }
        Collections.sort(arr);
        Collections.sort(arr1);
        return arr.equals(arr1);
    }
}