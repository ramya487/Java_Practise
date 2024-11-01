package graphs;
import java.util.*;

public class AdjList {
    public static void displayAdjList(List<List<Integer>> adjList, int n){
        for (int i = 1; i<=n; i++){
            System.out.print(i+": ");
            List<Integer> neighbours = adjList.get(i);
            for (int j = 0; j<neighbours.size(); j++){
                System.out.print(neighbours.get(j)+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        int n = 4, m = 4;
        int[][] edges = {{1,2}, {2,3}, {3,4}, {4,1}}; // values of vertices in range 1 - 4
        List<List<Integer>> adjList = new ArrayList<>(); // undirected non-weighted graph
        for (int i = 0; i<n+1; i++){
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i<edges.length; i++) {
            int[] edge = edges[i];
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        displayAdjList(adjList, n);
    }
}
