class Solution {
    public int maxArea(int[] height) {
        int answer = 0;
        int l = 0;
        int r = height.length - 1;

        while(l < r)
        {
            final int minH = Math.min(height[l], height[r]);
            answer = Math.max(answer, minH * (r - l));
            if(height[l] < height[r])
            l++;
            else
            r--;
        }
        return answer;
        
    }
}
