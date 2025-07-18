class Solution {
    public long minimumDifference(int[] nums) {
        final int n = nums.length / 3;
        long answer = Long.MAX_VALUE;
        long lSum = 0;
        long rSum = 0;

        Queue<Integer> maxH = new PriorityQueue<> (Collections.reverseOrder());
        Queue<Integer> minH = new PriorityQueue<>();

        long[] minLeftSum = new long[nums.length];

        for(int i = 0; i < 2 * n; ++i)
        {
            maxH.offer(nums[i]);
            lSum += nums[i];
            if(maxH.size() == n + 1)
            lSum -= maxH.poll();
            if(maxH.size() == n)
            minLeftSum[i] = lSum;
        }

        for(int i = nums.length - 1; i >= n; --i)
        {
            minH.offer(nums[i]);
            rSum += nums[i];
            if(minH.size() == n + 1)
            rSum -= minH.poll();
            if(minH.size() == n)
            answer = Math.min(answer, minLeftSum[i - 1] - rSum);
        }
        return answer;
    }
}
