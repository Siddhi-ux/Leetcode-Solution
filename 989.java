class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       LinkedList<Integer> list=new LinkedList<>();
       int n=num.length-1;
       while(n>=0 || k!=0){
           if(n>=0){
               k+=num[n];
               n--;
           }
           list.addFirst(k%10);
           k/=10;
       } 
       return list;
    }
}
