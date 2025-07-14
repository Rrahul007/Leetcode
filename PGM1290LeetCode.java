class Solution {
    public int getDecimalValue(ListNode head) {
        int answer = 0;

        for(; head != null; head = head.next)
        answer = answer * 2 + head.val;

        return answer;
    }
}
