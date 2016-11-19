package Problem1B;

import static org.junit.Assert.*;

import org.junit.Test;

public class EdgeImplTest {

	@Test
	public void getWeightTest() {
		Vertex from = new VertexImpl(1);
		Vertex to = new VertexImpl(2);
		EdgeImpl edge = new EdgeImpl(from, to, 20);
		assertEquals(20,edge.getWeight());
	}
	
	@Test
	public void getFromTest() {
		Vertex from = new VertexImpl(1);
		Vertex to = new VertexImpl(2);
		EdgeImpl edge = new EdgeImpl(from, to, 20);
		assertEquals(from, edge.getFrom());
	}
	
	@Test
	public void getToTest() {
		Vertex from = new VertexImpl(1);
		Vertex to = new VertexImpl(2);
		EdgeImpl edge = new EdgeImpl(from, to, 20);
		assertEquals(to, edge.getTo());
	}
	
	@Test
	public void goesToTrueTest() {
		Vertex from = new VertexImpl(1);
		Vertex to = new VertexImpl(2);
		EdgeImpl edge = new EdgeImpl(from, to, 20);
		assertEquals(true, edge.goesTo(to));
	}
	
	@Test
	public void goesToFalseTest() {
		Vertex from = new VertexImpl(1);
		Vertex to = new VertexImpl(2);
		EdgeImpl edge = new EdgeImpl(from, to, 20);
		assertEquals(false, edge.goesTo(from));
	}

}
