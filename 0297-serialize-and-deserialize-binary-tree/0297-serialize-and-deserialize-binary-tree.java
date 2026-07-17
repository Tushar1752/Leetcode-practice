
public class Codec {
    int i=0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return"N,";
        return root.val + "," + serialize(root.left) + serialize(root.right);   
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return build(data.split(","));
    }
    TreeNode build(String[] s){
        if(s[i].equals("N")){
            i++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(s[i++]));
        node.left=build(s);
        node.right = build(s);
        return node;
    }
}
