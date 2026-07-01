class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0){
            return "";
        }
        int[] need = new int[128];
        for(char ch : t.toCharArray()){
            need[ch]++;
        }
        int left=0;
        int right = 0;
        int count = t.length();
        int minlen = Integer.MAX_VALUE;
        int start =0;
        while(right<s.length()){
             char c = s.charAt(right);
             if(need[c]>0){
                count--;
             }
             need[c]--;
             right++;

        
        while(count==0){
            if(right-left<minlen){
                minlen = right - left;
                start = left;
            }
            char l = s.charAt(left);
            need[l]++;
            if(need[l]>0){
                count++;
            }
            left++;
        }
        }
        return minlen==Integer.MAX_VALUE ? "":s.substring(start,start+minlen);
    }
}