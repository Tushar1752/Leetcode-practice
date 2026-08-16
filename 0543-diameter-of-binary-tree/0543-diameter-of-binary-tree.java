
class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    
    }

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);

        diameter = Math.max(diameter, left+right);
       int max= Math.max(left , right);
        return max+1;

    }
}