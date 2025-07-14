class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> entry = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(entry.contains(nums[i]))
            {
                return true;
            }
            entry.add(nums[i]);
        }
        return false;

       /* 
       int counter = 0;
       for(int i = 0; i <= nums.length - 1; i++)
        {
            for(int j = i; j <= nums.length - 1; j++)
            {
                if(nums[i] == nums[j])
                {
                    counter++;
                }
                if(counter >= 2)
                {
                    return true;
                }
            }
            counter = 0;
        }
        return false; */
    }
}
