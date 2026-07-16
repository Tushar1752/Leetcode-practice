
class Solution {
    TreeNode xParent, yParent;
    int xDepth=-1, yDepth=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null,0,x,y);
        return xDepth==yDepth && xParent != yParent;

    }
    public void dfs(TreeNode root, TreeNode parent,int depth,int x,int y){
        if(root==null){
            return ;
        }
        if(root.val==x){
            xParent= parent;
            xDepth=depth;
        }
        if(root.val==y){
            yParent=parent;
            yDepth = depth;
        }
        dfs(root.left,root,depth+1,x,y);
        dfs(root.right,root,depth+1,x,y);
    }
}