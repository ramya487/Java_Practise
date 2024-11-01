package nodes;
import nodes.TreeNode;

public class ExampleTree2 {
    public static TreeNode getTree() {
        TreeNode root = new TreeNode(25);
        root.left = new TreeNode(20);
        root.right = new TreeNode(36);
        root.left.left = new TreeNode(10);
        root.left.left.left = new TreeNode(5);
        root.left.right = new TreeNode(22);
        root.left.left.right = new TreeNode(12);
        root.right.left = new TreeNode(30);
        root.right.left.left = new TreeNode(28);
        root.right.right = new TreeNode(40);
        root.right.right.left = new TreeNode(38);
        root.right.right.right = new TreeNode(48);
        return root;
    }
}
