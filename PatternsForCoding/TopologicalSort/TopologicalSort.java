package PatternsForCoding.TopologicalSort;

import java.util.*;

public class TopologicalSort {

    private int numVertices;
    private List<Integer>[] adjList;

    public TopologicalSort(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    private void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;

        for (Integer neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor, visited, stack);
            }
        }

        stack.push(v);
    }

    public Stack<Integer> topologicalSort() {
        Stack<Integer> stack = new Stack<>();

        boolean visited[] = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        System.out.println("Topological Sort:");
        Stack<Integer> result = graph.topologicalSort();
        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }
}

