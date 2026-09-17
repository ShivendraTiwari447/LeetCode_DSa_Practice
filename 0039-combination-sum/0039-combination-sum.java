class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int index, int[] arr, int target, List<Integer> curr, List<List<Integer>> res) {
        
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || index == arr.length) {
            return;
        }

        // Pick the element
        curr.add(arr[index]);
        backtrack(index, arr, target - arr[index], curr, res);

        // Backtrack
        curr.remove(curr.size() - 1);

        // Not pick → move to next
        backtrack(index + 1, arr, target, curr, res);
    }
}