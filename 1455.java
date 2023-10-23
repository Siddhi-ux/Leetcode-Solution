class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.split(" ");
        System.out.println(Arrays.toString(s));
        int i=0;
        for(String word: s)
        {
            i++;
            if(word.startsWith(searchWord)) return i;
        }
        return -1;
    }
}
