class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack =new Stack<>();
        for(String s : operations){
          switch(s){
            case "+":
            {
              int sec =stack.pop();
              int first =stack.peek();
              stack.push(sec);
              stack.push(sec+first);
              break;
            }
            case "D":
            {
              stack.push(stack.peek()*2);
              break;
            }
            case "C":
            {
              stack.pop();
              break;
            }
            default:
               stack.push(Integer.parseInt(s));
          }
        }
        int sum=0;
        while(!stack.isEmpty())
             sum+=stack.pop();
             return sum;
        
    }
}
