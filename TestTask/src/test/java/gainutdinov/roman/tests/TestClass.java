package gainutdinov.roman.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	@Test
	public void testPositive() {

		String[] w = {"qwe", "qwe", "qwe", "qwee", "a", "a", "a", "a"};

		assertEquals(2, testMethod(w));

	}
}
