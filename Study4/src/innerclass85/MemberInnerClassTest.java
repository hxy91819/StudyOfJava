package innerclass85;

public class MemberInnerClassTest {
	public static void main(String[] args) {
		//ʵ������Ա�ڲ���
		MemberInner.Inner2 inner = (new MemberInner()).new Inner2();
		
		inner.doSomething();
	}
}

class MemberInner{
	private int a = 4;
	
	/**
	 * ��Ա�ڲ���
	 * �뾲̬�Ĳ��ֻ����û��static����
	 * @author hxy
	 *
	 */
	public class Inner2{
		private int a = 5;
		
		public void doSomething(){
			System.out.println("hello world");
			
			System.out.println(a);//��ʱֻ�ܷ����ڲ����a
			
//			System.out.println(new MemberInner().a);//�����ⲿ��ĳ�Ա�ķ���1
			System.out.println(MemberInner.this.a);//�����ⲿ��ĳ�Ա�ķ���2
		}
	}
	
	public void method(){
		Inner2 inner = this.new Inner2();//�ⲿ���д����ڲ���Ķ���
	}
}
