import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        int prefS = 0;
        int count = 0;

        HashMap<Integer, Integer> h1 = new HashMap<>();

        h1.put(0, 1);

        for (int num : nums) {

            prefS += num;

            if (h1.containsKey(prefS - k)) {
                count += h1.get(prefS - k);
            }

            h1.put(prefS, h1.getOrDefault(prefS, 0) + 1);
        }

        return count;
    }
}