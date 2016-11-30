package Task8;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;


public class SolutionTest {

	@Test
	public void test() {
		try {
			assertEquals("3", Solution.run(new FileInputStream("datasets/2.8-sample.in")));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		try {
			assertEquals("2", Solution.run(new FileInputStream("datasets/2.8-test1.in")));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
