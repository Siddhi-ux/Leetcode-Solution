class Solution {
    public int[] finalPrices(int[] prices) {
        int[] arr= new int[prices.length];
        for(int i=0;i<prices.length;i++){
            if(arr.length-1 == i){
                arr[i]=prices[i];
                break;
            }
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] >= prices[j]){
                    arr[i]=prices[i]-prices[j];
                    break;
                }else{
                    arr[i]=prices[i];
                }
            }
        }
        return arr;
    }
}
