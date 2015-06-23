package proxy65.dynamicway;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 程序入口
 * 动态代理是理解Spring框架的关键。
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		
		InvocationHandler handler = new DynamicSubject(realSubject);//需要代理的类。
		
		Class<?> classType = handler.getClass();
		
		//下面的代码一次性生成代理
		
		Subject subject = (Subject)Proxy.newProxyInstance(
				classType.getClassLoader(), 
				realSubject.getClass().getInterfaces()
				, handler);
		
		subject.request();//此处指定了需要调用的函数。
		
		System.out.println("---------------------");
		
		System.out.println(subject.getClass());//null，这是临时生成的一个代理类。
	}
}
