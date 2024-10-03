package trees;
import nodes.*;
import java.util.*;

class Tuple {
    TreeNode root;
    int vertical;
    Tuple(TreeNode root, int vertical){
        this.root = root;
        this.vertical = vertical;
    }
}

public class TopViewBT {
    public static List<Integer> getTopView(TreeNode root){
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root, 0));

        Map<Integer, Integer> mp = new TreeMap<>();

        while (!q.isEmpty()){
            Tuple t = q.poll();
            if (!mp.containsKey(t.vertical)){
                mp.put(t.vertical, t.root.val);
            }
            if (t.root.left != null) q.add(new Tuple(t.root.left, t.vertical-1));
            if (t.root.right != null) q.add(new Tuple(t.root.right, t.vertical+1));
        }

        List<Integer> ret = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> item: mp.entrySet()){
            int element = item.getValue();
            ret.add(element);
        }

        return ret;
    }
    public static void main(String[] args){
        TreeNode root = ExampleBST.getTree();
        List<Integer> topViewList = getTopView(root);
        System.out.println(topViewList);
    }
}
