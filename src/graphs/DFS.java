package graphs;
import java.util.*;
import graphs.ExampleGraph;

public class DFS {
    public static void displayList(List<List<Integer>> adjList){
        for (int i = 0; i<adjList.size(); i++){
            System.out.println(i+" "+adjList.get(i));
        }
    }
    public static void dfs(List<Integer> ret, List<List<Integer>> adjList, int[] vis, Integer node){
        ret.add(node);
        vis[node] = 1;
        for (Integer neighbour: adjList.get(node)){
            if (vis[neighbour] == 0){
                dfs(ret, adjList, vis, neighbour);
            }
        }
    }
    public static void main(String[] args){
        List<List<Integer>> adjList = ExampleGraph.getAdjList();
//        displayList(adjList);
        List<Integer> ret = new ArrayList<>();
        int[] vis = new int[9];
        dfs(ret, adjList, vis, 1);
        System.out.println(ret);
    }
}
