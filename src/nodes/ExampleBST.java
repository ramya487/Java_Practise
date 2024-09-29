package nodes;
import nodes.TreeNode;

public class ExampleBST {
    public static TreeNode getTree(){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode seven = new TreeNode(7);

        two.left = one;
        two.right = three;

        four.left = two;
        four.right = seven; // note four is the root

        return four;
    }
}
