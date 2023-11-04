class Solution {
    public String getHint(String secret, String guess) {

        int[] arr1 = new int[10];
        Arrays.fill(arr1, 0);
        int[] arr2 = new int[10];
        Arrays.fill(arr2,0);

        int  a = 0;
        
        
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i))
            {
                a++;
                continue;
            }
            int s = secret.charAt(i) -'0';
            int g = guess.charAt(i) - '0';
            arr1[s] = arr1[s] +1;
            arr2[g] = arr2[g] +1;
        }
        int b=0;
        for(int i=0;i<10;i++){
            b += Math.min(arr1[i],arr2[i]);
        }

        String ans = String.valueOf(a) +"A"+String.valueOf(b)+"B";
        return ans;
        
    }
}
