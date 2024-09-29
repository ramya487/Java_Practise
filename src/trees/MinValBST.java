package trees;
import nodes.ExampleBST;
import nodes.TreeNode;

public class MinValBST {
    public static int getMinVal(TreeNode root){
        if (root == null) return Integer.MIN_VALUE;
        while (root.left != null){
            root = root.left;
        }
        return root.val;
    }

    public static void main(String[] args){
        TreeNode root = ExampleBST.getTree();
        int ret = getMinVal(root);
        System.out.println("Min value is: "+ret);
    }
}
