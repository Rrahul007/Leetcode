class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int[] count = new int[128];

        for(int l = 0, r = 0; r < s.length(); ++r)
        {
            ++count[s.charAt(r)];
            while(count[s.charAt(r)] > 1)
            --count[s.charAt(l++)];
            answer = Math.max(answer, r - l + 1);
        }
        return answer;
    }
}
