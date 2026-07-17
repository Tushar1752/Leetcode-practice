class Solution {
    int count =0;
    public int goodNodes(TreeNode root) {
        dfs(root, -20000);
        return count;
        
    }
    void dfs(TreeNode root, int max){
        if(root==null){
            return;
        }
        if(root.val>= max){
            count++;
        }
        max=Math.max(max,root.val);
        dfs(root.left,max);
        dfs(root.right,max);
    }
}