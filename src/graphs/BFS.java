package graphs;
import java.util.*;
import graphs.ExampleGraph;

public class BFS {
    public static void main(String[] args){
        List<List<Integer>> adjList = ExampleGraph.getAdjList(); // connected undirected non-weighted graph v: 1-8

        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[adjList.size()];

        List<Integer> bfs = new ArrayList<>();

        q.add(1); // since range of vertices is from 1-8
        vis[1] = 1;

        while (!q.isEmpty()){
            int front = q.poll();
            bfs.add(front);
            for (int neighbour: adjList.get(front)){
                if (vis[neighbour] == 0){
                    q.add(neighbour);
                    vis[neighbour] = 1;
                }
            }
        }

        System.out.println(bfs);
    }
}
