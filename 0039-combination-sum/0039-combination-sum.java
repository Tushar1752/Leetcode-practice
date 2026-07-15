class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates,target,0,new ArrayList<>());
        return ans;

        
    }
    public void solve(int[] arr, int target,int index, List<Integer>list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if (target<0 || index==arr.length){
            return;
        }
        //Take current element
        list.add(arr[index]);
        solve(arr,target-arr[index],index,list);
        //baccktrack

        list.remove(list.size()-1);
        //Dont take current element

        solve(arr,target,index+1, list);
    }
}