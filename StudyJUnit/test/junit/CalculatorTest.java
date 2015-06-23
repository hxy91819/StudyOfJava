package junit;

import junit.framework.Assert;
import junit.framework.TestCase;
import java.awt.*;

/**
 * 测试类必须要继承与TestCase父类
 * 
 * 在JUnit 3.8中，测试方法需要满足如下原则：
 * 
 * 1、public的 
 * 2、void的 
 * 3、无方法参数
 * 4、方法名称必须以test开头
 * 
 * 
 * @author hxy
 * 
 */
public class CalculatorTest extends TestCase {
	private Calculator cal;
	/**
	 * 初始化操作
	 */
	@Override
	public void setUp() throws Exception {
//		System.out.println("Set Up!");
		cal = new Calculator();
	}
	
	/**
	 * 收尾操作
	 */
	@Override
	public void tearDown() throws Exception {
//		System.out.println("Tear Down!");
	}
	
	@SuppressWarnings("deprecation")
	public void testadd(){
		int result = cal.add(1, 2);//测试用例
		
		//使用JUnit方法来进行测试（判断实际结果是否与期望结果一致）
		Assert.assertEquals(3, result);
	}
	
	@SuppressWarnings("deprecation")
	public void testSubtract(){
		int result = cal.subtract(1, 2);//测试用例
		
		//使用JUnit方法来进行测试（判断实际结果是否与期望结果一致）
		Assert.assertEquals(-1, result);
	}
	
	@SuppressWarnings("deprecation")
	public void testmultiply(){
		int result = cal.multiply(1, 2);//测试用例
		
		//使用JUnit方法来进行测试（判断实际结果是否与期望结果一致）
		Assert.assertEquals(2, result);
	}
	
	@SuppressWarnings("deprecation")
	public void testdivide(){
		int result2 = 0;
		
		try {
			result2 = cal.divide(6, 2);
		} catch (Exception e) {
			e.printStackTrace();
			
			Assert.fail();//使程序报Failtures
		}
		
		Assert.assertEquals(3, result2);
	}
	
	public void testDivideDivideByZero(){
		Throwable tx = null;
		
		try {
			cal.divide(6, 2);
			Assert.fail("测试失败，需要报出异常时未报出");//如果没抛异常，则不符合预期。
		} catch (Exception e) {
			//抛异常是符合我们预期的
			tx = e;
		}
		
		Assert.assertEquals(Exception.class, tx.getClass());//比较实际抛出的异常和期望抛出的异常
		
		Assert.assertEquals("除数不能为0", tx.getMessage());//比较异常内容。
	}
	
	/**
	 * 单独使用JUnit来进行测试
	 * 如果使用Eclipse则不需要这个方法，方法已经被屏蔽了
	 * @param args
	 */
	public static void main(String[] args) {
		//命令行的方式来执行（实际开发中常用的）
		junit.textui.TestRunner.run(CalculatorTest.class);
	}
}
