
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        int i=0;
        while(i<flowerbed.length){ 
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0) && (i == flowerbed.length-1 || flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    c++;
                }
            }
            i ++;
        }
        return c>=n;
    }
}
