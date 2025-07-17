class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] ptr = new int[k][k];
        for (final int x : nums) {
            for (int y = 0; y < k; ++y) {
                ptr[x % k][y] = ptr[y][x % k] + 1;
            }
        }
        return Arrays.stream(ptr).flatMapToInt(Arrays::stream).max().getAsInt();

    }
}
