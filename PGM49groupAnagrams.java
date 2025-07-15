class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for( final String str : strs)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            mp.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
