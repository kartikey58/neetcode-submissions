class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        int largest =0;
        for(int num:hs){
            if(!hs.contains(num-1)){
                 int current = num;
                 int length=1;
                while(hs.contains(current+1)){
                    length++;
                    current++;
                }
                largest = Math.max(length,largest);
            }
        }
        return largest;
    }
}