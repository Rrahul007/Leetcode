class Solution {
    public int maximumGain(String s, int x, int y) {
        return x > y ? recurr(s, "ab", x, "ba", y) : recurr(s,"ba", y, "ab", x);
    }

    private int recurr(final String s, final String sub1, int pt1, final String sub2, int pt2)
    {
        int score = 0;

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(final char c: s.toCharArray())
        {
            if(!stack1.isEmpty() && stack1.peek() == sub1.charAt(0) && c == sub1.charAt(1))
            {
                stack1.pop();
                score += pt1;
            }
            else
            {
                stack1.push(c);
            }
        }

        for(final char c: stack1)
        {
            if(!stack2.isEmpty() && stack2.peek() == sub2.charAt(0) && c == sub2.charAt(1))
            {
                stack2.pop();
                score += pt2;
            }
            else
            {
                stack2.push(c);
            }
        }
        return score;
    }
}
