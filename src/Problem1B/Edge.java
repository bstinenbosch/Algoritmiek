package Problem1B;

public interface Edge {

	/**
	 * @return weight of the edge;
	 */
	public int getWeight();
	
	/**
	 * Returns if the Edge goes to v;
	 */
	public boolean goesTo(Vertex v);

	/**
	 * @return The vertex the edge goes to.
	 */
	public Vertex getTo();
	
	/**
	 * @return The vertex the edge starts.
	 */
	public Vertex getFrom();
}
