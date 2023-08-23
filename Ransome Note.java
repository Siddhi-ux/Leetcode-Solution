class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming lowercase English letters

        // Count the characters in the magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++; // Increment the count for the character at its corresponding index
        }

        // Decrement character counts for ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }

        return true;
    }
}
