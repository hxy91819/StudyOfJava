package exception72;

public class ExceptionTest {
	public static void main(String[] args) {
		int c = 0;

		try {
			int a = 3;
			int b = 0;

			c = a / b;//�˴������쳣��ʱ�򣬾ͻ���ת��catch�У�����Ĵ��벻��ִ�С�
			
			System.out.println("in try");
		} catch (ArithmeticException e) {
			e.printStackTrace();//��ӡ�쳣��ջ��Ϣ��
		}
		finally{
			System.out.println("in finally");
		}

		System.out.println("hello world");

		System.out.println(c);
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
	}
}
