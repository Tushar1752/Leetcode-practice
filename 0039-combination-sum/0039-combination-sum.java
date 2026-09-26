class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(0,target, candidates, current, result);
        return result;


    }

    public void backtrack(int index, int remaining,int[] candidates,List<Integer> current, List<List<Integer>> result ){
        if(remaining==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(remaining <0){
            return;
        }

        for(int i = index; i<candidates.length; i++){
            current.add(candidates[i]);
            backtrack(i, remaining-candidates[i], candidates, current, result);
            current.remove(current.size()-1);
        }

    }
}