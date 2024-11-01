package trees;
import nodes.*;
import java.util.*;

public class DeleteNode {
    public static void preOrder(TreeNode root){
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args){
        TreeNode root = ExampleTree2.getTree();
        preOrder(root);
    }
}
