package innerclass85;

public class LocalInnerClassTest {
	public static void main(String[] args) {
		new LocalInner().doSomething();
	}
}

class LocalInner {
	public void doSomething() {
		//�ֲ��ڲ����������ʷ������涨��ı�������˱���������final����
		final int a = 4;
		/**
		 * �ֲ��ڲ��� �޷��ڷ����ⲿʹ�������
		 * 
		 * @author hxy
		 * 
		 */
		class Inner3 {
			public void test() {
				System.out.println("hello world");
				
				System.out.println(a);
			}
		}

		new Inner3().test();
	}
}
