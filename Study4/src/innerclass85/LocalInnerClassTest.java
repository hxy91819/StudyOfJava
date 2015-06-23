package innerclass85;

public class LocalInnerClassTest {
	public static void main(String[] args) {
		new LocalInner().doSomething();
	}
}

class LocalInner {
	public void doSomething() {
		//局部内部类如果想访问方法里面定义的变量，则此变量必须用final限制
		final int a = 4;
		/**
		 * 局部内部类 无法在方法外部使用这个类
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
