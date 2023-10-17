class Solution {
    public int numberOfSteps(int num) {
        return siddhi(num,0);
    }
    private int siddhi(int num,int steps){
        if(num == 0)
        return steps;
        if(num%2 == 0)
        return siddhi(num/2,steps+1);
        return siddhi(num-1,steps+1);
    }
}
