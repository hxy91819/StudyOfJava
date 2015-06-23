package proxy65.dynamicway2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬������
 * @author hxy
 *
 */
public class CommonInvocationHandler implements InvocationHandler {
	private Object target;
	
	/**
	 * ��������֮�󣬻��������µ�Object
	 * @param target
	 */
	public void setTarget(Object target) {
		this.target = target;
	}

	public CommonInvocationHandler(Object target){//��Ҫ����Ķ�����Ҫ��������
		this.target = target;
	}
	
	public CommonInvocationHandler(){
		
	}
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(target, args);//���ñ�������������
	}
}
