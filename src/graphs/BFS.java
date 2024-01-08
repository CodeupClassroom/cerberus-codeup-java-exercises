package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void traverse(Vertex root) {
        Queue<Vertex> q = new LinkedList<>();

        root.setVisited(true);
        q.add(root);

        while(!q.isEmpty()) {
            Vertex v = q.remove();
            System.out.println("Dequeued " + v.toString());
            v.getAdjList().stream().forEach(neighbor -> {
                if(!neighbor.isVisited()) {
                    neighbor.setVisited(true);
                    q.add(neighbor);
                }
            });
        }
    }
}