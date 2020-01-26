package GraphBFS;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private int V;  //no of vertices
    private LinkedList<Integer>[] adj; //adjacency list

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // add edge to graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    /**
     * @param s Source in the graph
     */
    void BFS(int s) {
        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        //mask current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            //dequeue vertex and print;
            s = queue.poll();
            System.out.print(s + "");

            //get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it visited and enqueue
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("BFS from vertex 2");

        g.BFS(2);
    }

}
