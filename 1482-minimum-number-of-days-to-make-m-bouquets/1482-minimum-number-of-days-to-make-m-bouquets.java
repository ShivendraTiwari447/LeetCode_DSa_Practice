class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Total flowers needed
        long required = (long) m * k;

        if (required > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int bouquets = 0;
            int flowers = 0;

            for (int day : bloomDay) {

                if (day <= mid) {
                    flowers++;

                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }

                } else {
                    // Consecutive sequence broken
                    flowers = 0;
                }
            }

            if (bouquets >= m) {
                // Possible, try fewer days
                high = mid - 1;
            } else {
                // Not possible, need more days
                low = mid + 1;
            }
        }

        return low;
    }
}