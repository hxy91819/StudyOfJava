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
	 * ��������ǲ����������
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
 
			Assert.fail("����Ϊ�գ�Ӧ���쳣");
		} catch (Exception e) {
			th = e;
		}

		Assert.assertNotNull(th);//�޶�th���벻��Ϊnull�����Ϊnull�����ʧ�ܡ�

		Assert.assertEquals(Exception.class, th.getClass());
		Assert.assertEquals("���鲻��Ϊ��", th.getMessage());
	}

	public void testgetLargestZeroLength() {
		int[] array = new int[] {};

		Throwable th = null;

		try {
			homework.getLargest(array);

			Assert.fail("���鳤��Ϊ0��Ӧ���쳣");
		} catch (Exception e) {
			th = e;
		}

		if (th != null) {
			Assert.assertEquals(Exception.class, th.getClass());
			Assert.assertEquals("���鳤�Ȳ���Ϊ0", th.getMessage());
		} else {
			Assert.fail("�����ܲ����쳣");
		}
	}
}
