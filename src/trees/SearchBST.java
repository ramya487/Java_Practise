package trees;
import nodes.TreeNode;
import nodes.ExampleBST;
import java.util.Scanner;

public class SearchBST {
    static TreeNode searchBST(TreeNode root, int value){
        while (root != null && root.val != value){
            root = value > root.val ? root.right : root.left;
        }
        return root;
    }

    public static void main(String[] args){
        TreeNode root = ExampleBST.getTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = sc.nextInt();
        TreeNode ret = searchBST(root, value);
        if (!(ret == null)) System.out.println("found!!");
        else System.out.println("not found!!");
    }
}
