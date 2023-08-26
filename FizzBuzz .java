class Solution {
    public List<String> fizzBuzz(int n) {
        String[] res =new String[n];
        for(int i =1; i<n+1; i++){
            if(i % 15 == 0) res[i-1] = "FizzBuzz";
            else if(i%5 == 0) res[i-1] ="Buzz";
            else if(i%3 ==0) res[i-1] ="Fizz";
            else res[i-1] = Integer.toString(i);
        }
        return Arrays.asList(res);
    }
}
