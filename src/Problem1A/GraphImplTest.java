package Problem1A;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class GraphImplTest {
	
	@Test
	public void getStartTest() {
		try {
			Graph graph = new GraphImpl(new FileInputStream("example.in"));
			assertEquals(1, graph.getStart().getId());
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void getExitTest() {
		try {
			Graph graph = new GraphImpl(new FileInputStream("example.in"));
			assertEquals(5, graph.getExit().getId());
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void getVertexByIdTest() {
		try {
			Graph graph = new GraphImpl(new FileInputStream("example.in"));
			assertEquals(7, graph.getVertexById(7).getId());
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*@Test
	public void getNeighboursTest() {
		try {
			Graph graph = new GraphImpl(new FileInputStream("example.in"));
			assertTrue(graph.getNeighbours(graph.getVertexById(2)).contains(graph.getVertexById(3)));
			assertTrue(graph.getNeighbours(graph.getVertexById(2)).contains(graph.getVertexById(6)));
			assertFalse(graph.getNeighbours(graph.getVertexById(2)).contains(graph.getVertexById(1)));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
