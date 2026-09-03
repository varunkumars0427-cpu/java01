package day13;

import java.util.*;

public class graph {

    static boolean isBipartite(int[][] graph) {

        int n = graph.length;

        int[] color = new int[n];

        Arrays.fill(color, -1);

        Queue<Integer> queue = new LinkedList<>();

        for (int start = 0; start < n; start++) {

            if (color[start] != -1) {
                continue;
            }

            color[start] = 0;
            queue.add(start);

            while (!queue.isEmpty()) {

                int current = queue.poll();

                for (int next : graph[current]) {

                    if (color[next] == -1) {

                        color[next] = 1 - color[current];

                        queue.add(next);
                    }

                    else if (color[next] == color[current]) {

                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] graph = {
            {1, 2},
            {0, 3},
            {0, 3},
            {1, 2}
        };

        System.out.println(isBipartite(graph));
    }
}