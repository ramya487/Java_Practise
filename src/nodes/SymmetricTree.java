package nodes;
import nodes.TreeNode;

public class SymmetricTree {
    public static TreeNode getTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(9); // this node fails symmetric condition
        return root;
    }
}
