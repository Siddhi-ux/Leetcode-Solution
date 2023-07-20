class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

           
            row.add(1);

          
            for (int j = 1; j < i; j++) {
                List<Integer> previousRow = pascalsTriangle.get(i - 1);
                int num1 = previousRow.get(j - 1);
                int num2 = previousRow.get(j);
                row.add(num1 + num2);
            }

            
            if (i > 0) {
                row.add(1);
            }

            pascalsTriangle.add(row);
        }

        return pascalsTriangle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        Solution solution = new Solution();
        List<List<Integer>> pascalsTriangle = solution.generate(numRows);

       
        for (List<Integer> row : pascalsTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

