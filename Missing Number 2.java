class Solution {
    int missingNumber(int array[], int n) {
        int e=0;
        for(int i=1;i<=n;i++){
            e^=i;
        }
        int a=0;
        for(int num : array){
            a^=num;
        }
        return a^e;
    }
    
}
