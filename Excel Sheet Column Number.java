class Solution {
    public int titleToNumber(String columnTitle) {
        int res =0;
        for(int i=0;i<columnTitle.length();i++){
            char c = columnTitle.charAt(i);
            int d = c - 'A' +1;
            res =res *26 +d;
        }
        return res;
    }
}
