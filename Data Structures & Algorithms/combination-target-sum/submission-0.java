class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    private void backtrack(int index,int[] candidates,int target,List<List<Integer>> ans,List<Integer> curr){
        if(target ==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || index==candidates.length){
            return;
        }
        curr.add(candidates[index]);
        backtrack(index,candidates,target-candidates[index],ans,curr);
        curr.remove(curr.size()-1);
        backtrack(index+1,candidates,target,ans,curr);
    }
}