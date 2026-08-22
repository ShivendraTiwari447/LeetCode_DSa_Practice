class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int s = 0;
        int p = 1;

        while (n > 0) {
            int d = n % 10;

            s += d;
            p *= d;

            n /= 10;
        }

        return original % (s + p) == 0;
    }
}