package graphs;

import java.util.List;
import java.util.Stack;

public class TopoOrder {
    private Stack<Vertex> answer;

    public TopoOrder() {
        answer = new Stack<>();
    }

    public void order(List<Vertex> graph) {
        // go thru the graph and make sure we order all the vertices
        // might be multiple dfs calls

        for (Vertex v : graph) {
            if(!v.isVisited()) {
                dfs(v);
            }
        }

    }

    public void dfs(Vertex root) {
        root.setVisited(true);

        for (Vertex v : root.getAdjList()) {
            if(!v.isVisited()) {
                dfs(v);
            }
        }

        // dependencies get pushed first to answer (get popped last)
        // so least dependent thing will get popped first
        answer.push(root);
    }

    public Stack<Vertex> getAnswer() {
        return answer;
    }

    public static void main(String[] args) {
        TopoOrder topo = new TopoOrder();
        Vertex a = new Vertex("0");
        Vertex b = new Vertex("1");
        Vertex c = new Vertex("2");
        Vertex d = new Vertex("3");
        Vertex e = new Vertex("4");
        Vertex f = new Vertex("5");

        c.addNeighbor(d);
        d.addNeighbor(b);
        e.addNeighbor(a);
        e.addNeighbor(b);
        f.addNeighbor(a);
        f.addNeighbor(c);

        List<Vertex> graph = List.of(a, b, c, d, e, f);
        topo.order(graph);
        for (int i = 0; i < graph.size(); i++) {
            System.out.println(topo.getAnswer().pop());
        }
    }
}
