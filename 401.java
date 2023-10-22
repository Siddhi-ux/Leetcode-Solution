class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> res=new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m) == turnedOn){
                    if(m<10){
                        res.add(String.format("%d:0%d",h,m));
                    }
                    else{
                        res.add(String.format("%d:%d",h,m));
                    }
                }
            }
        }
        return res;
    }
}
