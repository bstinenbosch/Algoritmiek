package Problem1B;

import static org.junit.Assert.*;

import org.junit.Test;

public class VertexImplTest {

	@Test
	public void getIdTest() {
		Vertex v = new VertexImpl(1);
		assertEquals(1, v.getId());
	}
	
	@Test
	public void toStringTest() {
		Vertex v = new VertexImpl(1);
		assertEquals("<Vertex 1>", v.toString());
	}
	
	@Test
	public void compareEqualTest() {
		Vertex v = new VertexImpl(1);
		Vertex u = new VertexImpl(1);
		assertEquals(0, v.compareTo(u));
	}
	
	@Test
	public void compareLagerTest() {
		Vertex v = new VertexImpl(1);
		Vertex u = new VertexImpl(2);
		assertEquals(-1, v.compareTo(u));
	}
	
	@Test
	public void compareSmallerTest() {
		Vertex v = new VertexImpl(1);
		Vertex u = new VertexImpl(0);
		assertEquals(1, v.compareTo(u));
	}

}
