class Solution {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int ls =s.lastIndexOf(' ');
        String lw =s.substring(ls+1);
        return lw.length();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = lengthOfLastWord( s);

    }
}
