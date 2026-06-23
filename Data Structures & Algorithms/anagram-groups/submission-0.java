class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str:strs){

            char[] ch= str.toCharArray(); 
            Arrays.sort(ch);
            String sorted = new String(ch);
            map.computeIfAbsent(sorted,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}