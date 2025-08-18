class Solution {
    public int maximum69Number (int num) {
        char[] answer = String.valueOf(num).toCharArray();
        for(int i=0; i < answer.length;++i)
        if(answer[i] == '6')
        {
            answer[i] = '9';
            break;
        }
        return Integer.valueOf(String.valueOf(answer));
    }
}
