class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }

    private void backtrack(int index,
                           int[] candidates,
                           int target,
                           List<List<Integer>> ans,
                           List<Integer> curr) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (i > index && candidates[i] == candidates[i - 1])
                continue;

            curr.add(candidates[i]);

            backtrack(i + 1,
                      candidates,
                      target - candidates[i],
                      ans,
                      curr);

            curr.remove(curr.size() - 1);
        }
    }
}
