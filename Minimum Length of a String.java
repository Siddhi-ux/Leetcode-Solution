class Solution {
    public int minLength(String s) {
        while(s.indexOf("AB")>=0 || s.indexOf("CD")>=0){
            var a=s.indexOf("AB");
            var b=s.indexOf("CD");

            if(a>=0){
                s=s.substring(0,a)+s.substring(a+2,s.length());
            }else{
                s=s.substring(0,b)+s.substring(b+2,s.length());
            }

        }
        return s.length();
    }
}
