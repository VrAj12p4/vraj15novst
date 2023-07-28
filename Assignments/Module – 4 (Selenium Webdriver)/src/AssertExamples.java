//10.

import org.junit.Assert;
import org.junit.Test;

public class AssertExamples {

	@Test
	public void testAssertEquals() {
		int expectedValue = 10;
		int actualValue = 5 + 5;

		Assert.assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testAssertTrue() {
		boolean condition = true;

		Assert.assertTrue(condition);
	}

	@Test
	public void testAssertFalse() {
		boolean condition = false;

		Assert.assertFalse(condition);
	}

	@Test
	public void testAssertNotNull() {
		String str = "Hello, World!";

		Assert.assertNotNull(str);
	}

	@Test
	public void testAssertNull() {
		String str = null;

		Assert.assertNull(str);
	}

	@Test
	public void testAssertArrayEquals() {
		int[] expectedArray = { 1, 2, 3 };
		int[] actualArray = { 1, 2, 3 };

		Assert.assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testAssertSame() {
		String str1 = "Hello";
		String str2 = "Hello";

		Assert.assertSame(str1, str2);
	}

	@Test
	public void testAssertNotSame() {
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		Assert.assertNotSame(str1, str2);
	}

	@Test
	public void testFail() {
		Assert.fail("This test is meant to fail.");
	}
}
