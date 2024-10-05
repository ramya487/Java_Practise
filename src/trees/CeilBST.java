package trees;
import nodes.*;
import java.util.Scanner;

public class CeilBST {
    public static int getCeil(TreeNode root, int target){
        int ret = -1;
        while (root != null){
            if (root.val == target) return root.val;
            else if (root.val > target){
                ret = root.val;
                root = root.left;
            }else {
                root = root.right;
            }

        }
        return ret;
    }
    public static void main(String[] args){
        TreeNode root = ExampleBST.getTree();
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ceil = getCeil(root, target);
        if (ceil == -1) System.out.println("ceil not found!!");
        else System.out.println(ceil);
    }
}
