package innerclass85;

public class StaticInnerClassTest {
	public static void main(String[] args) {
		//实例化内部类的方法
		StaticInner.Inner inner = new StaticInner.Inner();
		
		inner.test();
	}
	

}

class StaticInner{
	private static int a = 4;
	/**
	 * 内部类
	 * static修饰的类，必定是内部类。
	 * @author hxy
	 *
	 */
	public static class Inner{
		public void test(){
			System.out.println(a);
		}
	}
}