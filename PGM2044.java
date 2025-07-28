class Solution {
    int maxOR;
    int count;
    int[] nums;
    public int countMaxOrSubsets(int[] nums) {
        maxOR = 0;

        for(int num : nums)
        {
            maxOR |= num;
        }

        this.nums = nums;
        dfs(0, 0);
        return count;
    }

    private void dfs (int index, int currentOR)
    {
        if(index == nums.length)
        {
            if(currentOR == maxOR)
            {
                count++;
            }
            return;
        }

        dfs(index + 1, currentOR);

        dfs(index + 1, currentOR | nums[index]);
    }
}
