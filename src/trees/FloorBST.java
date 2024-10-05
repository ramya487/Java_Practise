package trees;
import nodes.*;
import java.util.Scanner;

public class FloorBST {
    public static int getFloor(TreeNode root, int target){
        int ret = -1;
        while (root != null){
            if (root.val == target) return root.val;
            else if (root.val > target){
                root = root.left;
            }else {
                ret = root.val;
                root = root.right;
            }

        }
        return ret;
    }
    public static void main(String[] args){
        TreeNode root = ExampleBST.getTree();
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int floor = getFloor(root, target);
        if (floor == -1) System.out.println("floor not found!!");
        else System.out.println(floor);
    }
}
