import java.util.*;

public class PrimMST {

    // Helper class to store edge information: {weight, vertex, parent}
    static class Edge implements Comparable<Edge> {
        int weight;
        int vertex;
        int parent;

        public Edge(int weight, int vertex, int parent) {
            this.weight = weight;
            this.vertex = vertex;
            this.parent = parent;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void primMST(int V, List<List<Edge>> adj) {
        // Priority queue acts as a min-heap based on edge weight
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[V];
        int totalWeight = 0;

        // Start from vertex 0 with weight 0 and no parent (-1)
        pq.add(new Edge(0, 0, -1));

        System.out.println("MST Edges:");
        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int weight = current.weight;
            int u = current.vertex;
            int parent = current.parent;

            // If the vertex is already visited, skip it
            if (visited[u]) {
                continue;
            }
            visited[u] = true;

            // Process the edge if it's not the starting pseudo-edge
            if (parent != -1) {
                System.out.println(parent + " - " + u + " : " + weight);
                totalWeight += weight;
            }

            // Iterate through all adjacent vertices
            for (Edge edge : adj.get(u)) {
                int v = edge.vertex;
                int w = edge.weight;
                if (!visited[v]) {
                    pq.add(new Edge(w, v, u));
                }
            }
        }
        System.out.println("Total MST Weight = " + totalWeight);
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Edge>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Helper method to add undirected edges
        // Note: For adjacency list in Java, we store the destination and weight in the Edge object
        // The third parameter (parent) is initially 0 when adding to the graph.
        var addEdge = new Object() {
            void accept(int u, int v, int w) {
                adj.get(u).add(new Edge(w, v, 0));
                adj.get(v).add(new Edge(w, u, 0));
            }
        };

        addEdge.accept(0, 1, 2);
        addEdge.accept(0, 3, 6);
        addEdge.accept(1, 2, 3);
        addEdge.accept(1, 3, 8);
        addEdge.accept(1, 4, 5);
        addEdge.accept(2, 4, 7);
        addEdge.accept(3, 4, 9);

        primMST(V, adj);
    }
}
