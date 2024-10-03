package trees;
import nodes.*;

public class IsSymmetric {
    public static boolean util(TreeNode left, TreeNode right){
        if (left == null || right == null) return left == right;

        /*
        if left and right both null: return true
        if left is null and right not null or left not null and right null: return false
        if both contain data then perform check
         */

        return left.val == right.val && util(left.left, right.right) && util(left.right, right.left);
    }
    public static boolean isSymmetric(TreeNode root){
        if (root == null) return true;
        return util(root.left, root.right);
    }
    public static void main(String[] args){
        TreeNode root = SymmetricTree.getTree();
        if (isSymmetric(root)) System.out.println("Tree is symmetric!!");
        else System.out.println("Tree is not symmetric!!");
    }
}
