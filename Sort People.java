class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i], names[i]);

        }
        ArrayList<Integer> h= new ArrayList<>(map.keySet());
        h.sort(Collections.reverseOrder());
        String[] res =new String[names.length];
        for(int j=0;j<h.size();j++){
            res[j] = map.get(h.get(j));
        }
        return res;
    }
}
