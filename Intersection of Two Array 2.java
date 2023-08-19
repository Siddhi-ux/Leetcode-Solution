class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m = nums2.length;
        HashMap<Integer,Integer> f =new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num : nums1){
            f.put(num, f.getOrDefault(num,0)+1);

        }
        for(int num : nums2){
            if(f.containsKey(num) && f.get(num)>0){
                res.add(num);
                f.put(num,f.get(num) -1);
            }
        }
        int[] resArray = new int[res.size()];
        for(int i=0;i<res.size();i++){
            resArray[i] = res.get(i);
        }
       return resArray;
    }
}
