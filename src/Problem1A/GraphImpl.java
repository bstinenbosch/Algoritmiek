package Problem1A;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class GraphImpl implements Graph{
	private Vertex start;
	private Vertex exit;
	private Set<Vertex> allVertices = new TreeSet<Vertex>();
	private ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	private Map<Vertex, ArrayList<Edge>> outgoing = new HashMap<Vertex, ArrayList<Edge>>();

	public GraphImpl(InputStream input) {
		Scanner sc = new Scanner(input);
		int numberOfVertices = sc.nextInt();
		for (int i = 0; i<numberOfVertices; i++) {
			vertices.add(new VertexImpl(i+1));
			allVertices.add(vertices.get(i));
		}
		sc.nextInt(); 
		start = getVertexById(sc.nextInt());
		exit = getVertexById(sc.nextInt());
		while(sc.hasNextInt()) { // add edges
			Vertex from = getVertexById(sc.nextInt());
			Vertex to = getVertexById(sc.nextInt());
			int weight = sc.nextInt();
			Edge edge = new EdgeImpl(from, to, weight);
			// if vertex already in map, add edge to bucket
			if (outgoing.containsKey(from)) {
				ArrayList<Edge> bucket = outgoing.get(from);
				bucket.add(edge);
				outgoing.put(from, bucket);
			} else { // else add to map
				ArrayList<Edge> bucket = new ArrayList<Edge>();
				bucket.add(edge);
				outgoing.put(from, bucket);
				
			}
		}
		sc.close();
	}
	
	/**
	 * returns the vertex with the id. if no vertex with that id, return null
	 * @param id
	 */
	@Override
	public Vertex getVertexById(int id) {
		if (id<=vertices.size()) {
			return vertices.get(id-1);
		}
		return null;
	}

	/**
	 * Returns all outgoing vertecis.
	 */
	@Override
	public ArrayList<Edge> getNeighbours(Vertex v) {
		return outgoing.get(v);
	}

	/**
	 * @return Returns all vertices
	 */
	@Override
	public Collection<Vertex> getAllVertices() {
		return allVertices;
	}
	
	/**
	 * @return start
	 */
	public Vertex getStart() {
		return start;
	}
	
	/**
	 * @return Exit
	 */
	public Vertex getExit() {
		return exit;
	}
}
