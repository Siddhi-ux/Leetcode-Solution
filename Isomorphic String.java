import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char rep = t.charAt(i);
            
            if (!map.containsKey(original)) {
                if (!map.containsValue(rep)) {
                    map.put(original, rep);
                } else {
                    return false; // Mapping conflict: different original characters can't map to the same replacement character
                }
            } else {
                char mapped = map.get(original);
                if (mapped != rep) {
                    return false; // Conflict in mapping
                }
            }
        }
        
        return true; // All characters successfully mapped
    }
}
