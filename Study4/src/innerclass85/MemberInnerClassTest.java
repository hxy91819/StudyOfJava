package innerclass85;

public class MemberInnerClassTest {
	public static void main(String[] args) {
		//实例化成员内部类
		MemberInner.Inner2 inner = (new MemberInner()).new Inner2();
		
		inner.doSomething();
	}
}

class MemberInner{
	private int a = 4;
	
	/**
	 * 成员内部类
	 * 与静态的差别只在于没有static修饰
	 * @author hxy
	 *
	 */
	public class Inner2{
		private int a = 5;
		
		public void doSomething(){
			System.out.println("hello world");
			
			System.out.println(a);//此时只能访问内部类的a
			
//			System.out.println(new MemberInner().a);//访问外部类的成员的方法1
			System.out.println(MemberInner.this.a);//访问外部类的成员的方法2
		}
	}
	
	public void method(){
		Inner2 inner = this.new Inner2();//外部类中创建内部类的对象。
	}
}
