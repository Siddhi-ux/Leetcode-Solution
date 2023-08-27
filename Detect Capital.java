class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for (char c : word.toCharArray()) {
            if(Character.isUpperCase(c)){
                count++;
            }
            if(count == 0 || count == word.length()){
                return true;
            }
           
        }
         return count==1 && Character.isUpperCase(word.charAt(0));
    }
}
