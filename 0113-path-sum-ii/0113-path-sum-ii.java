
class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<>());
        return ans;
        
    }

    private void dfs(TreeNode root, int target, List<Integer>path){
        if(root==null){
            return ;
        }
        path.add(root.val);
        if(root.left == null & root.right==null&& target==root.val){
            ans.add(new ArrayList<>(path));

        }
        dfs(root.left,target-root.val,path);
        dfs(root.right, target-root.val,path);
        path.remove(path.size()-1);
    }
}