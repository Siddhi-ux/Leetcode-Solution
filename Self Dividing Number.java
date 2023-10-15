class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            int c=0;
            while(num>0){
                int r=num%10;
                if(r==0){
                    c=0;
                    break;
                }
                else if(i%r==0){
                    c++;
                    num=num/10;
                }
                else{
                    c=0;
                    break;
                }
            }
            if(c>0){
                arr.add(i);
            }
        }
        return arr;
    }
}
