package PatternsForCoding.TopologicalSort;

import java.util.*;

public class TaskScheduling {

    public static boolean canScheduleTasks(int tasks, int[][] prerequisites) {
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

        int count = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;
            for (int child : graph[current]) {
                inDegree[child]--;
                if (inDegree[child] == 0) {
                    queue.offer(child);
                }
            }
        }

        return count == tasks;
    }

    public static void main(String[] args) {
        int tasks = 3;
        int[][] prerequisites = {{0, 1}, {1, 2}};
        System.out.println(canScheduleTasks(tasks, prerequisites));  
    }
}

