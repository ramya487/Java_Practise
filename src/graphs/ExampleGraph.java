package graphs;
import java.util.*;

public class ExampleGraph {
    public static List<List<Integer>> getAdjList(){
        int v = 8;
        int[][] edges = {{1,2}, {1,6}, {2,3}, {3,4}, {6,7},{6,8},{4,5},{7,5}};
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i<=v; i++){
            adjList.add(new ArrayList<Integer>());
        }

        for (int[] edge: edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]); // connected undirected non-weighted graph
        }

        return adjList;
    }
}
