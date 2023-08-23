class Solution {
    public String reverseVowels(String s) {
        char[] chars=s.toCharArray();
        int l=0;
        int r=chars.length-1;
        while(l<r){
            if(is(chars[l]) && is(chars[r])){
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r]=temp;
                l++;
                r--;
            }else if(is(chars[l])){
                r--;
            }else if(is(chars[r])){
                l++;
            }else{
                l++;
                r--;
            }
        }
        return new String(chars);

    }
    public boolean is(char c){
        c =Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
