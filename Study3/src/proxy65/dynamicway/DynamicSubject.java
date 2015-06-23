package proxy65.dynamicway;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬������
 * ˵�������ã�
 * �ô�������ڲ�������Object���ͣ�ʵ��ʹ�õ�ʱ��ͨ������Ĺ��췽�����ݽ���һ������
 * ���⣬���໹ʵ����invoke�������÷����е�method.invoke��ʵ���ǵ��ñ���������
 * ��Ҫִ�еķ���������������sub����ʾ�÷���������sub��ͨ����̬�����࣬���ǿ�����
 * ִ����ʵ����ķ���ǰ�󣬼����Լ���һЩ���ⷽ����
 * �Լ�����᣺
 * �����ڲ��޸�Դ���������£����Դ��������ڼ����ɵ��ࡣҪ�ԱȾ�̬�����������
 * ÿ����̬�����࣬����һ��InvocationHandler
 * @author Administrator
 *
 */
public class DynamicSubject implements InvocationHandler {

	private Object sub;
	
	public DynamicSubject(Object obj){
		this.sub = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before calling: " + method);
		
		method.invoke(sub, args);//���ô��������ȼ���Request������
		
		System.out.println("after calling: " + method);
		
		return null;
	}

}
