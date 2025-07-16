class Solution {
    public int maximumLength(int[] nums) {
        int n = 2;
        int[][] sub = new int[n][n];
        for (final int x : nums)
            for (int y = 0; y < 2; ++y)
                sub[x % 2][y] = sub[y][x % 2] + 1;

        return Arrays.stream(sub).flatMapToInt(Arrays::stream).max().getAsInt();
    }
}
