class Solution {
    public int beautySum(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {

                // Current character ki frequency increase
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // Maximum aur minimum non-zero frequency find karo
                for (int k = 0; k < 26; k++) {

                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                // Beauty = max frequency - min frequency
                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
}