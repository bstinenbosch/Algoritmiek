package Problem1B;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Implements a BFS traversal of the Graph starting at a certain vertex v. 
 * It return nodes at most once.
 */
class GraphIterator implements Iterator<Vertex> {

  private Graph g;
  private Vertex v;
  private Queue<Vertex> queue;
  private HashSet<Vertex> colored;
  
	public GraphIterator(Graph g, Vertex v) {
	  this.g  = g;
	  this.v = v;
	  if (g!=null&&v!=null) {this.reset();}
	}

	public void reset() {
	    queue = new LinkedList<Vertex>();
	    colored = new HashSet<Vertex>();
	    queue.add(v);
	    v.visit();
	    colored.add(v);
	}

	@Override
	public boolean hasNext() {
		return (queue.peek()!=null);
	}

	@Override
	public Vertex next() {
    if (hasNext()) {
    	ArrayList<Edge> neighbours = g.getNeighbours(queue.peek());
    	if (neighbours!=null) {
	        for (Edge edge : neighbours) {
	          if (!colored.contains(edge.getTo())) {
	            queue.add(edge.getTo());
	            colored.add(edge.getTo());
	          }
	        }
    	}
    	return queue.remove();
    }
    return null;
	}
	
	@Override
	public void remove() {
	  // Can be ignored.
	}
}