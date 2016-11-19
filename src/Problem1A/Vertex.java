package Problem1A;

interface Vertex extends Comparable<Vertex> {
	
	/**
	 * @return the id of the vertex
	 */
	public int getId();
	
	public boolean visited();
	
	public void visit();

}
