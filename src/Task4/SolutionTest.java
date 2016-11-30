package Task4;

import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		try {
			assertEquals("18", Solution.run(new FileInputStream("datasets/2.4-sample.in")));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		try {
			assertEquals("12", Solution.run(new FileInputStream("datasets/2.4-test3.in")));
		} catch (FileNotFoundException e) {
			fail();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
