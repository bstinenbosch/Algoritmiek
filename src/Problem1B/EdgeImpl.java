package Problem1B;

public class EdgeImpl implements Edge {
	
	private Vertex from;
	private Vertex to;
	private int weight;
	
	public EdgeImpl(Vertex from, Vertex to, int weight){
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
	@Override
	public int getWeight() {
		return weight;
	}
	
	@Override
	public boolean goesTo(Vertex v) {
		return (to.equals(v));
	}
	
	@Override
	public Vertex getTo() {
		return to;
	}
	
	@Override
	public Vertex getFrom() {
		return from;
	}	
}
