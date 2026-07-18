class Solution {
    int ans;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }
    int inorder(TreeNode root, int k){
        if(root==null){
            return k;
        }
        k=inorder(root.left,k);
        if(--k==0){
            ans=root.val;
        }
        return inorder(root.right,k);
    }
}