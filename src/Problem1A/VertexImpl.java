package Problem1A;

public class VertexImpl implements Vertex{

	public boolean visited = false;
	private int id;
	
	/**
	 * Constructor
	 * @param id
	 */
	public VertexImpl(int id) {
		this.id = id;
	}
	
	/**
	 * Compares id's
	 */
	@Override
	public int compareTo(Vertex that) {
		int a = this.getId();
		int b = that.getId();
		int cmp;
		if (a > b)
		   cmp = +1;
		else if (a < b)
		   cmp = -1;
		else
		   cmp = 0;
		return cmp;
	}

	/**
	 * returns ID
	 */
	@Override
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "<Vertex " + getId() + ">";
	}

	@Override
	public boolean visited() {
		return visited;
	}

	@Override
	public void visit() {
		visited = true;
		
	}

}
