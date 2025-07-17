class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        int resCount = 0;
        
        for(int val : nums)
        {
            set1.add(val);
        }

        for(int val : nums)
        {
            if(set1.contains(val) && !set1.contains(val-1))
            {
                int curr = val;
                int count = 0;
                while(set1.contains(curr))
                {
                    set1.remove(curr);
                    curr++;
                    count++;
                }
                resCount = Math.max(resCount, count);
            }
        }
        return resCount;
    }
}
