class Solution {
    public int totalFruit(int[] fruits) {
        int answer = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int l = 0, r = 0; r < fruits.length; ++r)
        {
            count.merge(fruits[r], 1, Integer :: sum);
            while(count.size() > 2)
            {
                count.merge(fruits[l], -1, Integer :: sum);
                count.remove(fruits[l], 0);
                ++l;
            }
            answer = Math.max(answer, r - l + 1);
        }
        return answer;
    }
}
