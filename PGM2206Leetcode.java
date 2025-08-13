class Solution {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];

        for (final int n : nums)
            ++count[n];

        return Arrays.stream(count).allMatch(c -> c % 2 == 0);
    }
}
