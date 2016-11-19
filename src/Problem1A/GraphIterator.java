package Problem1A;

import java.util.ArrayList;
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
  Queue<Vertex> queue;
  
	public GraphIterator(Graph g, Vertex v) {
	  this.g  = g;
	  this.v = v;
	  if (g!=null&&v!=null) {this.reset();}
	}

	public void reset() {
	    queue = new LinkedList<Vertex>();
	    queue.add(v);
	    v.visit();
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
	          if (!edge.getTo().visited()) {
	            queue.add(edge.getTo());
	            edge.getTo().visit();
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