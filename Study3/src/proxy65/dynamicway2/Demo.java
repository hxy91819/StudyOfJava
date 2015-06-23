package proxy65.dynamicway2;

import java.lang.reflect.Proxy;

/**
 * ���Կͻ���
 * @author hxy
 *
 */
public class Demo {
	public static void main(String[] args) {
		CommonInvocationHandler handler = new CommonInvocationHandler();
		
		Foo f  = null;
		
		handler.setTarget(new FooImpl());
		
		//����1��������Ҫ������ࣨ�ӿ���ɣ�������2�����ɵĴ�������Ҫ�����Ľӿڣ�
		f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(), 
				new Class[]{Foo.class}, handler);
		
		f.doAction();
		
		handler.setTarget(new FooImpl2());
		
//		System.out.println("--------------------");
//		
//		f.doAction();
		
		System.out.println("---------------------");
		
		//����1��������Ҫ������ࣨ�ӿ���ɣ�������2�����ɵĴ�������Ҫ�����Ľӿڣ�
		f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(), 
				new Class[]{Foo.class}, handler);
		
		f.doAction();
	}
}
