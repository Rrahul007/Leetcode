class Solution {
    public int compress(char[] chars) {
        int answer = 0;
        for (int i = 0; i < chars.length;) {
            final char letter = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }

            chars[answer++] = letter;
            if (count > 1)
                for (final char c : String.valueOf(count).toCharArray())
                    chars[answer++] = c;
        }
        return answer;
    }
}
