package PatternsForCoding.TopologicalSort;

import java.util.*;

public class TaskSchedulingOrder {

    public static List<Integer> findOrder(int tasks, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[tasks];
        for (int i = 0; i < tasks; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] inDegree = new int[tasks];
        for (int[] prerequisite : prerequisites) {
            graph[prerequisite[0]].add(prerequisite[1]);
            inDegree[prerequisite[1]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < tasks; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> sortedOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            sortedOrder.add(current);
            for (int child : graph[current]) {
                inDegree[child]--;
                if (inDegree[child] == 0) {
                    queue.offer(child);
                }
            }
        }

        if (sortedOrder.size() != tasks) return new ArrayList<>();  // Not possible to schedule all tasks

        return sortedOrder;
    }

    public static void main(String[] args) {
        int tasks = 3;
        int[][] prerequisites = {{0, 1}, {1, 2}};
        System.out.println(findOrder(tasks, prerequisites));  // Expected output: [2, 1, 0]
    }
}

