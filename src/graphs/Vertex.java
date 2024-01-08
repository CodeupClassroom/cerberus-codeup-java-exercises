package graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Vertex> adjList;
    private boolean visited;

    public Vertex(String name) {
        this.name = name;
        adjList = new ArrayList<>();
        visited = false;
    }


    @Override
    public String toString() {
        return "Vertex [name=" + name + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex> getAdjList() {
        return adjList;
    }

    public void addNeighbor(Vertex v) {
        adjList.add(v);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void visit() {
        this.visited = true;
        System.out.println(name + " has been visited");
    }
}