class Solution {
    public static boolean isPalindrome(String s) {
        s =s.toLowerCase();
        int l=0;
        int r=s.length()-1;

        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        boolean isPalindrome = isPalindrome(s);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
