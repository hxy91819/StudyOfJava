package junit;

import junit.framework.Assert;
import junit.framework.TestCase;
import java.awt.*;

/**
 * ���������Ҫ�̳���TestCase����
 * 
 * ��JUnit 3.8�У����Է�����Ҫ��������ԭ��
 * 
 * 1��public�� 
 * 2��void�� 
 * 3���޷�������
 * 4���������Ʊ�����test��ͷ
 * 
 * 
 * @author hxy
 * 
 */
public class CalculatorTest extends TestCase {
	private Calculator cal;
	/**
	 * ��ʼ������
	 */
	@Override
	public void setUp() throws Exception {
//		System.out.println("Set Up!");
		cal = new Calculator();
	}
	
	/**
	 * ��β����
	 */
	@Override
	public void tearDown() throws Exception {
//		System.out.println("Tear Down!");
	}
	
	@SuppressWarnings("deprecation")
	public void testadd(){
		int result = cal.add(1, 2);//��������
		
		//ʹ��JUnit���������в��ԣ��ж�ʵ�ʽ���Ƿ����������һ�£�
		Assert.assertEquals(3, result);
	}
	
	@SuppressWarnings("deprecation")
	public void testSubtract(){
		int result = cal.subtract(1, 2);//��������
		
		//ʹ��JUnit���������в��ԣ��ж�ʵ�ʽ���Ƿ����������һ�£�
		Assert.assertEquals(-1, result);
	}
	
	@SuppressWarnings("deprecation")
	public void testmultiply(){
		int result = cal.multiply(1, 2);//��������
		
		//ʹ��JUnit���������в��ԣ��ж�ʵ�ʽ���Ƿ����������һ�£�
		Assert.assertEquals(2, result);
	}
	
	@SuppressWarnings("deprecation")
	public void testdivide(){
		int result2 = 0;
		
		try {
			result2 = cal.divide(6, 2);
		} catch (Exception e) {
			e.printStackTrace();
			
			Assert.fail();//ʹ����Failtures
		}
		
		Assert.assertEquals(3, result2);
	}
	
	public void testDivideDivideByZero(){
		Throwable tx = null;
		
		try {
			cal.divide(6, 2);
			Assert.fail("����ʧ�ܣ���Ҫ�����쳣ʱδ����");//���û���쳣���򲻷���Ԥ�ڡ�
		} catch (Exception e) {
			//���쳣�Ƿ�������Ԥ�ڵ�
			tx = e;
		}
		
		Assert.assertEquals(Exception.class, tx.getClass());//�Ƚ�ʵ���׳����쳣�������׳����쳣
		
		Assert.assertEquals("��������Ϊ0", tx.getMessage());//�Ƚ��쳣���ݡ�
	}
	
	/**
	 * ����ʹ��JUnit�����в���
	 * ���ʹ��Eclipse����Ҫ��������������Ѿ���������
	 * @param args
	 */
	public static void main(String[] args) {
		//�����еķ�ʽ��ִ�У�ʵ�ʿ����г��õģ�
		junit.textui.TestRunner.run(CalculatorTest.class);
	}
}
