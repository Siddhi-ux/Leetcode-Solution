import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
   


        int n = s.length();
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                String pattern = "(" + substring + ")+";
                
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(s);
                
                if (m.matches()) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
   
}
