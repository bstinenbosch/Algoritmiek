package Problem1A;

import java.util.ArrayList;
import java.util.Collection;

interface Graph {

	/**
	 * @param id
	 *            to look for a vertex by.
	 * @return the vertex or null if not found.
	 */
	public Vertex getVertexById(int id);

	/**
	 * Returns the neighbours in a sorted collection by id
	 *
	 * @param v
	 *            node to get the neighbours of.
	 * @return sorted collection of neighbours.
	 */
	public ArrayList<Edge> getNeighbours(Vertex v);

	/**
	 * @return an unsorted collection of all vertices in the graph.
	 */
	public Collection<Vertex> getAllVertices();

	public Vertex getStart();
	
	public Vertex getExit();
}