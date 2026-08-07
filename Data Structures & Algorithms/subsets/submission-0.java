class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,new ArrayList<>(),ans,0);
        return ans;
    }
    private void backtrack(int[] nums,List<Integer> curr,List<List<Integer>> ans,int index ){
        ans.add(new ArrayList<>(curr));
        for(int i = index;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,curr,ans,i+1);
            curr.remove(curr.size()-1);
        }
    }
}