class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder rs = new StringBuilder();
        for(String word : words){
            StringBuilder rw = new StringBuilder(word).reverse();
            rs.append(rw).append(" ");
        }
        return rs.toString().trim();
    }
}
