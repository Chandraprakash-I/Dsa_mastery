package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Integer, List<Integer>> adjacencyList;
    Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(int vertex,int neighbor){
        this.adjacencyList.computeIfAbsent(vertex ,k-> new ArrayList<Integer>()).add(neighbor);
        this.adjacencyList.computeIfAbsent(neighbor ,k-> new ArrayList<Integer>(vertex));

    }
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[adjacencyList.size()];
        dfsRecursive(startVertex, visited);
    }

    public void dfsRecursive(int startVertex,boolean[] visited){

        System.out.println(startVertex);

        visited[startVertex]=true;
        List<Integer> a=this.adjacencyList.get(startVertex);
        if(a!=null){
            for(int b:a){
                if(!visited[b]){
                    dfsRecursive(b,visited);
                }

            }
        }

    }
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Depth-First Search starting from vertex 2:");
        graph.dfs(2);
    }

}
