package Problem1A;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		try {
			assertEquals("yes", Solution.run(new FileInputStream("example.in")));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test7() {
		try {
			assertEquals("yes", Solution.run(new FileInputStream("dataset7.in")));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
