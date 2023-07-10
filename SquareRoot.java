class Solution {
    public static int mySqrt(int x) {
        int squareRoot = (int)Math.sqrt(x);
        return squareRoot;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sq = mySqrt(x);
        System.out.println(x);
          
    }
}
