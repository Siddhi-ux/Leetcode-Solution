public class Solution {
    public boolean buddyStrings(String A, String B) {
        // Check if the lengths of A and B are equal
        if (A.length() != B.length())
            return false;
        
        // If A and B are the same, we need at least one character to be repeated
        if (A.equals(B)) {
            int[] count = new int[26];
            for (char c : A.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > 1)
                    return true;
            }
            return false;
        }
        
        // Find the first pair of mismatched characters
        int first = -1, second = -1;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (first == -1)
                    first = i;
                else if (second == -1)
                    second = i;
                else
                    return false;
            }
        }
        
        // Check if swapping A[first] and A[second] makes A and B equal
        return (second != -1 && A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first));
    }
}
