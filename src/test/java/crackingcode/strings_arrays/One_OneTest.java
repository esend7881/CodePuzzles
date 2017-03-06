package crackingcode.strings_arrays;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class One_OneTest {
	@Rule
	public TestName name = new TestName();
	private StopWatch sw;
	public static final String str;
	static {
		StringBuilder sb = new StringBuilder();
		for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++)
			sb.append((char) i);
		str = sb.toString();
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
	public void testSet() {
		for (int i = 0; i < 100; i++)
			assertTrue(new One_One().isUnique(str));
	}

	@Test
	public void testPrim() {
		for (int i = 0; i < 100; i++)
			assertTrue(new One_One().isUniqueP(str));
	}

}
