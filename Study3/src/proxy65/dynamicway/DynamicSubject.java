package proxy65.dynamicway;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * 说明与作用：
 * 该代理类的内部属性是Object类型，实际使用的时候通过该类的构造方法传递进来一个对象。
 * 此外，该类还实现了invoke方法，该方法中的method.invoke其实就是调用被代理对象的
 * 将要执行的方法，方法参数是sub，表示该方法从属于sub，通过动态代理类，我们可以在
 * 执行真实对象的方法前后，加入自己的一些额外方法。
 * 自己的体会：
 * 就是在不修改源代码的情况下，可以代理运行期间生成的类。要对比静态代理的特征。
 * 每个动态代理类，都有一个InvocationHandler
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
		
		method.invoke(sub, args);//调用代理函数，等价于Request方法。
		
		System.out.println("after calling: " + method);
		
		return null;
	}

}
