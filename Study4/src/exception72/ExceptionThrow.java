package exception72;

/**
 * 抛出异常
 * @author hxy
 *
 */
public class ExceptionThrow {
	/**
	 * method如果遇到异常向调用方抛出。
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
