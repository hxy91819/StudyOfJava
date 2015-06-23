package junit;

import junit.framework.Assert;
import junit.framework.TestCase;

@SuppressWarnings("deprecation")
public class HomeworkTest extends TestCase {
	private Homework homework;

	@Override
	protected void setUp() throws Exception {
		homework = new Homework();
	}

	/**
	 * 这个方法是测试正常情况
	 */
	public void testgetLargest() {
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		int largest = 0;

		try {
			largest = homework.getLargest(array);
		} catch (Exception e) {
			System.out.println("testgetLargest");
//			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertEquals(5, largest);
	}

	public void testgetLargestNull() {
		int[] array = null;

		Throwable th = null;

		try {
			homework.getLargest(array);
 
			Assert.fail("数组为空，应报异常");
		} catch (Exception e) {
			th = e;
		}

		Assert.assertNotNull(th);//限定th必须不能为null，如果为null则测试失败。

		Assert.assertEquals(Exception.class, th.getClass());
		Assert.assertEquals("数组不能为空", th.getMessage());
	}

	public void testgetLargestZeroLength() {
		int[] array = new int[] {};

		Throwable th = null;

		try {
			homework.getLargest(array);

			Assert.fail("数组长度为0，应报异常");
		} catch (Exception e) {
			th = e;
		}

		if (th != null) {
			Assert.assertEquals(Exception.class, th.getClass());
			Assert.assertEquals("数组长度不能为0", th.getMessage());
		} else {
			Assert.fail("不可能不报异常");
		}
	}
}
