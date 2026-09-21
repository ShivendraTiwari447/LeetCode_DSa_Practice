class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        backtrack(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    static void backtrack(int[] nums, int index,
                          List<Integer> curr,
                          List<List<Integer>> ans) {

        // current subset add
        ans.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {

            // duplicate skip
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // choose
            curr.add(nums[i]);

            // explore
            backtrack(nums, i + 1, curr, ans);

            // backtrack
            curr.remove(curr.size() - 1);
        }
    }
}