class Solution {
    public String reversePrefix(String word, char ch) {
        int index= word.indexOf(ch);
        String rev =new StringBuilder(word.substring(0,index +1)).reverse().toString();
        return rev + word.substring(index+1);
        

    }
}
