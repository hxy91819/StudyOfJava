package innerclass85;

public class StaticInnerClassTest {
	public static void main(String[] args) {
		//ʵ�����ڲ���ķ���
		StaticInner.Inner inner = new StaticInner.Inner();
		
		inner.test();
	}
	

}

class StaticInner{
	private static int a = 4;
	/**
	 * �ڲ���
	 * static���ε��࣬�ض����ڲ��ࡣ
	 * @author hxy
	 *
	 */
	public static class Inner{
		public void test(){
			System.out.println(a);
		}
	}
}