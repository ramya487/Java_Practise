package trees;
import nodes.*;
import java.util.*;

// T- O(N)
// S- O(H)
public class BoundaryTraversal {
    public static void preOrder(TreeNode root, List<Integer> ls){
        if (root == null) return;
        if (root.left == null && root.right == null) ls.add(root.val);
        preOrder(root.left, ls);
        preOrder(root.right, ls);
    }
    public static List<Integer> boundaryTrav(TreeNode root){
        List<Integer> ret = new ArrayList<>();

        // get left boundary excluding leaves
        TreeNode temp = root;
        while (temp != null){
            if (temp.left != null || temp.right != null) ret.add(temp.val);
            if (temp.left != null) temp = temp.left;
            else temp = temp.right;
        }

        // get leaves using dfs
        preOrder(root, ret);

        // get right boundary excluding leaves
        Stack<Integer> st = new Stack<>();
        temp = root.right;
        while (temp != null){
            if (temp.left != null || temp.right != null) st.add(temp.val);
            if (temp.right != null) temp = temp.right;
            else temp = temp.left;
        }

        while (!st.isEmpty()){
            ret.add(st.pop());
        }

        return ret;
    }
    public static void main(String[] args){
        TreeNode root = ExampleTree.getTree();
        List<Integer> bTrav = boundaryTrav(root);
        System.out.println(bTrav);
    }
}
