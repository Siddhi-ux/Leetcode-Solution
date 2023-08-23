class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sc =s.toCharArray();
        char[] st =t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);

        if(Arrays.equals(sc,st)){
            return true;
        }else{
            return false;
        }
    }
}
