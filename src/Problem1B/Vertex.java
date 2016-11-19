package Problem1B;


interface Vertex extends Comparable<Vertex> {
	
	/**
	 * @return the id of the vertex
	 */
	public int getId();
	
	public boolean visited();
	
	public void visit();
	
	public void setWeight(int weight);
	
	public int getWeight();

}
