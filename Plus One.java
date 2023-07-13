class Solution {
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print( i + 1 );
            digits[i] = sc.nextInt();
        }
        int[] result = plusOne(digits);
    }
}
