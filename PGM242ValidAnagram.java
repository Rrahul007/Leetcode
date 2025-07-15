class Solution {
    public boolean isAnagram(String s, String t)
    {        
        if(s.length() != t.length())
        return false;
        
        int[] counter = new int[26];

        for(final char Character1 : s.toCharArray())
        {
            ++counter[Character1 - 'a'];
        }
        for(final char Character1 : t.toCharArray())
        {
            if(counter[Character1 - 'a'] == 0)
            return false;
            --counter[Character1 - 'a'];
        }
        return true;
    }
}
