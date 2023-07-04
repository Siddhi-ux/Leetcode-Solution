class Solution {
    public static  boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
         StringBuilder reversestr =new StringBuilder(xStr).reverse();
      
        return xStr.equals(reversestr.toString());
    
        
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
