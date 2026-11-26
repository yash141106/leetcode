class Solution {
    public int numWays(String s) {
        final long MOD = 1_000_000_007L;
        int n = s.length();

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') total++;
        }

        if (total % 3 != 0) return 0;

        if (total == 0) {
            long m = n - 1;                      // number of gaps
            return (int) ((m * (m - 1) / 2) % MOD);
        }

        int k = total / 3;
        long firstCut = 0, secondCut = 0;
        int ones = 0;
        int endK = -1, end2K = -1;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones++;
                if (ones == k) endK = i;
                else if (ones == k + 1) firstCut = i - endK;
                if (ones == 2 * k) end2K = i;
                else if (ones == 2 * k + 1) secondCut = i - end2K;
            }
        }

        return (int) ((firstCut * secondCut) % MOD);
    }
}