#Java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if(m == 0) return new ArrayList<>();
        int n = matrix[0].length;
        if(n == 0) return new ArrayList<>();
        
        
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
       
        int[] limits = {n-1, m-1, 0, 0};
        int dir = 0;
        List<Integer> ans = new ArrayList<>();
        int r = 0, c = 0;
        int k = m*n;
        
        while(k-- > 0){
            
            
            ans.add(matrix[r][c]);
            
            if(r + dirs[dir][0] < limits[3] || 
               r + dirs[dir][0] > limits[1] || 
               c + dirs[dir][1] < limits[2] || 
               c + dirs[dir][1] > limits[0]){
                
                limits[(dir+4-1)%4] += ((dir+4-1)%4 < 2) ? -1 : 1;
               
                dir = (dir+1)%4;
               
            }
            
            r += dirs[dir][0];
            c += dirs[dir][1];
        }
                          
        return ans;
    }
}

class solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if(m == 0) return new ArrayList<>();
        int n = matrix[0].length;
        if(n == 0) return new ArrayList<>();
        
        int r1 = 0, r2 = m-1, c1 = 0, c2 = n-1;
        List<Integer> ans = new ArrayList<>();
        
        while(r1 <= r2 && c1 <= c2){
            //iterate through one layer
            for(int c = c1; c <= c2; ++c) ans.add(matrix[r1][c]);
            for(int r = r1+1; r <= r2; ++r) ans.add(matrix[r][c2]);
            if(r1 < r2 && c1 < c2){
                //if this layer is not one row or one column
                for(int c = c2-1; c >= c1; --c) ans.add(matrix[r2][c]);
                for(int r = r2-1; r >= r1+1; --r) ans.add(matrix[r][c1]);
            }
            
            ++r1;
            --r2;
            ++c1;
            --c2;
        }
        
        return ans;
    }
}
