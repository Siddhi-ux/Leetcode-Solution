import java.util.HashMap;
class Solution {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> rv=new HashMap<>();
        rv.put('I',1);
        rv.put('V',5);
        rv.put('X',10);
        rv.put('L',50);
        rv.put('C',100);
        rv.put('D',500);
        rv.put('M',1000);
       
       int res =0;
       int prev =0;

       for(int i=s.length()-1;i>=0;i--){
           char c=s.charAt(i);
           int curr = rv.get(c);

           if(curr<prev){
               res-=curr;
           }
           else{
               res+=curr;
           }
           prev =curr;
       }
       return res;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        int res = romanToInt(s);
        System.out.print(s+"="+res);

    }
}
