package Problem1B;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		try {
			assertEquals("118", Solution.run(new FileInputStream("example.in")));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test7() {
		try {
			assertEquals("850", Solution.run(new FileInputStream("dataset7.in")));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
