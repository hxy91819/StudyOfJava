package exception72;

/**
 * �׳��쳣
 * @author hxy
 *
 */
public class ExceptionThrow {
	/**
	 * method��������쳣����÷��׳���
	 * @throws Exception
	 */
	public void method() throws Exception {
		System.out.println("hello world");
		
		throw new Exception();
	}
	
	public static void main(String[] args) {
		ExceptionThrow test = new ExceptionThrow();
		
		try {
			test.method();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("in finally");
		}
	}
}
