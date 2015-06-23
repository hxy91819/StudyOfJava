package proxy65.dynamicway;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * �������
 * ��̬���������Spring��ܵĹؼ���
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		
		InvocationHandler handler = new DynamicSubject(realSubject);//��Ҫ������ࡣ
		
		Class<?> classType = handler.getClass();
		
		//����Ĵ���һ�������ɴ���
		
		Subject subject = (Subject)Proxy.newProxyInstance(
				classType.getClassLoader(), 
				realSubject.getClass().getInterfaces()
				, handler);
		
		subject.request();//�˴�ָ������Ҫ���õĺ�����
		
		System.out.println("---------------------");
		
		System.out.println(subject.getClass());//null��������ʱ���ɵ�һ�������ࡣ
	}
}
