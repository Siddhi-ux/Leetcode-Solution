class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        if (r * c != m * n) {
            return mat; // If reshape is not possible, return the original matrix.
        }
        
        int[][] ans = new int[r][c];
        
        for (int i = 0; i < r * c; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }
        
        return ans;
    }
}
