class Solution {
    public int lengthOfLongestSubstring(String s) {
        String c="";
        int max =0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(c.indexOf(ch)!=-1){
                int index = c.indexOf(ch);
                c=c.substring(index+1);
            }
            c=c+ch;
            max=Math.max(max,c.length());
        }
        return max;

    }
}