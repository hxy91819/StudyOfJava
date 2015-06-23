package junit;

import junit.framework.Assert;
import junit.framework.TestCase;

@SuppressWarnings({ "deprecation" })
public class MyStackTest extends TestCase {
	private MyStack myStack;

	@Override
	protected void setUp() throws Exception {
		myStack = new MyStack();
	}

	/*
	 * ����push��top��������
	 */
	public void testpushandtop() {
		String element = "mytestString";
		
		//push
		try {
			myStack.push(element);
		} catch (Exception e) {
			Assert.fail();
		}

		
		//top��֤��ȡ
		String topElement = "";
		try {
			topElement = myStack.top();
		} catch (Exception e) {
			Assert.fail();
		}

		Assert.assertEquals(element, topElement);
	}

	/*
	 * ����pushԽ������
	 */
	public void testpushOutBound() {
		String elementString = "mytestString";// ��ӵ�Ԫ��ͷ
		String comElementString = "";// ����ַ���=elementString + ����

		Throwable th = null;//����������֤���쳣��Ϣ

		//���ǰ100��
		for (int i = 0; i < 100; i++) {
			comElementString = elementString + i;
			try {
				myStack.push(comElementString);
			} catch (Exception e) {
				Assert.fail();// ���100��Ӧ�ò��ܱ��쳣
			}
		}

		//��ӵ�101��
		comElementString = elementString + 100;
		try {
			myStack.push(comElementString);
			Assert.fail();
		} catch (Exception e) {
			th = e;
		}

		// ��֤�쳣��Ϣ
		Assert.assertNotNull(th);// �޶�th���벻��Ϊnull�����Ϊnull�����ʧ�ܡ�
		Assert.assertEquals(Exception.class, th.getClass());
		Assert.assertEquals("����Խ���쳣", th.getMessage());
	}
	
	/**
	 * �������������pop
	 */
	public void testpop(){
		String element = "mytestString";
		
		//push
		try {
			myStack.push(element);
		} catch (Exception e) {
			Assert.fail();
		}
		
		String popElement = "";
		//pop
		try {
			popElement = myStack.pop();
		} catch (Exception e) {
			Assert.fail();
		}
		
		Assert.assertEquals(element, popElement);
	}
	
	/**
	 * ����popԽ��
	 */
	public void testpopOutBound(){
		Throwable th = null;
		
		//pop
		try {
			myStack.pop();
			Assert.fail();
		} catch (Exception e) {
			th = e;
		}
		
		Assert.assertNotNull(th);
		Assert.assertEquals(Exception.class, th.getClass());
		Assert.assertEquals("����Խ���쳣", th.getMessage());
	}
}
