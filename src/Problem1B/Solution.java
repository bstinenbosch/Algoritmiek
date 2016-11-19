package Problem1B;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.InputStream;

public class Solution {
	
	// Implement the solve method to return the answer to the problem posed by the inputstream.
	public String solve(InputStream in) {
		Graph g = new GraphImpl(in);
		Vertex from = g.getStart();
		Vertex to = g.getExit();
		return Integer.toString(shortestPath(g,from,to));
		
	}
	
	/**
	   * Find the shortest path between v and u in the graph g with Dijkstra's algorithm.
	   *
	   * @param g
	   *            graph to search in.
	   * @param v
	   *            node to start from.
	   * @param u
	   *            node to reach.
	   * @return the nodes that form the shortest path, including v and u. An
	   *         empty list iff there is no path between v and u.
	   */
	  public static int shortestPath(Graph g, Vertex v, Vertex u) {
	    
		Comparator<Vertex> comparator = new WeightComparator();
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>(10, comparator);
    
	    if (v==u) return 0; // if same
	    
	    // check if nodes are in the same component
	    boolean possible = false;
	    GraphIterator iter = new GraphIterator(g, v);
	    while (iter.hasNext()) {
	      Vertex vertex = iter.next();
	      queue.add(vertex);
	      if (vertex==u) possible = true;
	    }
	    if (!possible) return -1;
	    
	    // if possible:
	    Vertex vertex = v;
	    int outgoingEdges = g.getNeighbours(vertex).size();
	    for (Edge edge : g.getNeighbours(vertex)) {
	      Vertex to = edge.getTo();
	      if (to.getWeight() == Integer.MAX_VALUE) to.setWeight(0);
	      to.setWeight(edge.getWeight() + outgoingEdges);
	      queue.add(to);
	    }
	    queue.remove(vertex);
	    
	    // Dijkstra's algorithm
	    while (vertex!=null) { // is this statement correct?
	      vertex = queue.poll();
	      if (vertex!=null) {
	    	if (vertex == u) {
	    		return vertex.getWeight();
	    	}
	        if (g.hasNeighbours(vertex)) {
	        	outgoingEdges = g.getNeighbours(vertex).size();
		        for (Edge edge : g.getNeighbours(vertex)) {
		          Vertex to = edge.getTo();
		          if (to.getWeight() == Integer.MAX_VALUE) to.setWeight(0);
		          	int newWeight = vertex.getWeight()+edge.getWeight()+outgoingEdges;
		            if (to.getWeight()>newWeight||to.getWeight()==0) {
		            	to.setWeight(newWeight);
		            	queue.add(to);
		            }
		        }
	      	}
	      } 
	    }
	    return -1;
	  }
	  
	// You can leave the following method unchanged.
	public static String run(InputStream in) {
		return new Solution().solve(in);
	}
	
}
