

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        if (start == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i); // Place the current element at the start index
            current.add(nums[start]); // Include the current element in the permutation
            backtrack(nums, start + 1, current, result); // Recur for the rest of the array
            current.remove(current.size() - 1); // Backtrack by removing the current element
            swap(nums, start, i); // Restore the original array by swapping back
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
