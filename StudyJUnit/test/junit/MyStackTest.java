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
	 * 测试push和top两个函数
	 */
	public void testpushandtop() {
		String element = "mytestString";
		
		//push
		try {
			myStack.push(element);
		} catch (Exception e) {
			Assert.fail();
		}

		
		//top验证读取
		String topElement = "";
		try {
			topElement = myStack.top();
		} catch (Exception e) {
			Assert.fail();
		}

		Assert.assertEquals(element, topElement);
	}

	/*
	 * 测试push越界的情况
	 */
	public void testpushOutBound() {
		String elementString = "mytestString";// 添加的元素头
		String comElementString = "";// 组合字符串=elementString + 数字

		Throwable th = null;//保存用于验证的异常信息

		//添加前100个
		for (int i = 0; i < 100; i++) {
			comElementString = elementString + i;
			try {
				myStack.push(comElementString);
			} catch (Exception e) {
				Assert.fail();// 添加100个应该不能报异常
			}
		}

		//添加第101个
		comElementString = elementString + 100;
		try {
			myStack.push(comElementString);
			Assert.fail();
		} catch (Exception e) {
			th = e;
		}

		// 验证异常信息
		Assert.assertNotNull(th);// 限定th必须不能为null，如果为null则测试失败。
		Assert.assertEquals(Exception.class, th.getClass());
		Assert.assertEquals("数组越界异常", th.getMessage());
	}
	
	/**
	 * 测试正常情况下pop
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
	 * 测试pop越界
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
		Assert.assertEquals("数组越界异常", th.getMessage());
	}
}
