import java.util.*;
import java.io.*;
 
class BFS {
    public static void main(String[] args) {
 
        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
 
        boolean[] visited = new boolean[13];
        Arrays.fill(visited, false);
 
        for(int i = 0; i < 13; ++i) {
            graph.add(new ArrayList<Node>());
        }
 
        graph.get(1).add(new Node(2));
        graph.get(1).add(new Node(3));
        graph.get(1).add(new Node(4));
        graph.get(2).add(new Node(5));
        graph.get(2).add(new Node(6));
        graph.get(4).add(new Node(7));
        graph.get(4).add(new Node(8));
        graph.get(5).add(new Node(9));
        graph.get(5).add(new Node(10));
        graph.get(7).add(new Node(11));
        graph.get(7).add(new Node(12));
       
        Queue<Node> queue = new LinkedList<Node>();
 
        queue.add(new Node(1));
        visited[1] = true;
 
        while(queue.peek() != null) {
 
            Node curr = queue.remove();
 
            System.out.println(curr.data);
 
            for(Node neighbor: graph.get(curr.data)) {
                if(!visited[neighbor.data]) {
                    queue.add(neighbor);
                    visited[neighbor.data] = true;
                }
            }
        }
    }
}
 
class Node {
    int data;
 
    public Node(int d) {
        data = d;
    }
}