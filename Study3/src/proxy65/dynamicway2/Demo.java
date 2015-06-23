package proxy65.dynamicway2;

import java.lang.reflect.Proxy;

/**
 * 测试客户端
 * @author hxy
 *
 */
public class Demo {
	public static void main(String[] args) {
		CommonInvocationHandler handler = new CommonInvocationHandler();
		
		Foo f  = null;
		
		handler.setTarget(new FooImpl());
		
		//参数1，加载需要代理的类（接口亦可）；参数2，生成的代理类需要声明的接口；
		f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(), 
				new Class[]{Foo.class}, handler);
		
		f.doAction();
		
		handler.setTarget(new FooImpl2());
		
//		System.out.println("--------------------");
//		
//		f.doAction();
		
		System.out.println("---------------------");
		
		//参数1，加载需要代理的类（接口亦可）；参数2，生成的代理类需要声明的接口；
		f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(), 
				new Class[]{Foo.class}, handler);
		
		f.doAction();
	}
}
