package proxy65.dynamicway2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * @author hxy
 *
 */
public class CommonInvocationHandler implements InvocationHandler {
	private Object target;
	
	/**
	 * 构造完了之后，还能设置新的Object
	 * @param target
	 */
	public void setTarget(Object target) {
		this.target = target;
	}

	public CommonInvocationHandler(Object target){//需要代理的对象需要传进来。
		this.target = target;
	}
	
	public CommonInvocationHandler(){
		
	}
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(target, args);//调用被代理对象的内容
	}
}
