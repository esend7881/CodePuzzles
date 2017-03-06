package crackingcode.strings_arrays;

import static org.junit.Assert.*;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class One_TwoTest {

	@Rule
	public TestName name = new TestName();
	private StopWatch sw;
	public static final String str1, str2;
	static {
		StringBuilder sb = new StringBuilder();
		for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE*1000; i++)
			sb.append((char) i);
		str1 = sb.toString();
		str2 = sb.reverse().toString();
	}

	@Before
	public void before() {
		sw = new StopWatch();
		sw.start();
	}

	@After
	public void after() {
		System.out.printf("Finished test %s in %s%n", name.getMethodName(), sw);
	}

	@Test
	public void testMap() {
		assertTrue(new One_Two().isPerm(str1, str2));
	}

	@Test
	public void testArr() {
		assertTrue(new One_Two().isPerm2(str1, str2));
	}

}
