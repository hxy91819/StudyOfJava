package exception72;

public class ExceptionTest {
	public static void main(String[] args) {
		int c = 0;

		try {
			int a = 3;
			int b = 0;

			c = a / b;//此处发生异常的时候，就会跳转到catch中，后面的代码不再执行。
			
			System.out.println("in try");
		} catch (ArithmeticException e) {
			e.printStackTrace();//打印异常堆栈信息。
		}
		finally{
			System.out.println("in finally");
		}

		System.out.println("hello world");

		System.out.println(c);
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
	}
}
