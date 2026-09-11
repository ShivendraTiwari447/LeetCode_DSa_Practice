class Solution {
    public int totalNumbers(int[] digits) {

        boolean[] used = new boolean[1000];
        int count = 0;

        // Unit place ke liye even digit choose karo
        for (int i = 0; i < digits.length; i++) {

            if (digits[i] % 2 != 0) {
                continue;
            }

            // Hundreds place
            for (int j = 0; j < digits.length; j++) {

                // Same digit position use nahi karni
                if (j == i) {
                    continue;
                }

                // Hundreds place 0 nahi ho sakta
                if (digits[j] == 0) {
                    continue;
                }

                // Tens place
                for (int k = 0; k < digits.length; k++) {

                    if (k == i || k == j) {
                        continue;
                    }

                    int number = digits[j] * 100
                               + digits[k] * 10
                               + digits[i];

                    // Duplicate number ko count nahi karna
                    if (!used[number]) {
                        used[number] = true;
                        count++;
                    }
                }
            }
        }

        return count;
    }
}