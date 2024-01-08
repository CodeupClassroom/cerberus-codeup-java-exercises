package graphs;

import java.util.Stack;

public class DFS {

    public static void traverse(Vertex root) {
        Stack<Vertex> s = new Stack<>();

        root.setVisited(true);
        s.push(root);

        while(!s.isEmpty()) {
            Vertex v = s.pop();
            System.out.println("Working on " + v);

            v.getAdjList().stream()
                    .forEach(neighbor -> {
                        if(!neighbor.isVisited()) {
                            neighbor.setVisited(true);
                            s.push(neighbor);
                        }
                    });
        }
    }

    public static void traverseRecursive(Vertex root) {
        root.setVisited(true);
        System.out.println("Working on " + root);

        root.getAdjList().stream()
                .forEach(neighbor -> {
                    if(!neighbor.isVisited()) {
                        traverseRecursive(neighbor);
                    }
                });
    }
}