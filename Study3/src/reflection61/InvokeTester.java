package reflection61;

import java.lang.reflect.Method;

/**
 * 使用反射调用类的方法。
 * @author Administrator
 *
 */
public class InvokeTester {
	public int add(int param1, int param2) {
		return param1 + param2;
	}

	public String echo(String message) {
		return "Hello: " + message;
	}

	public static void main(String[] args) throws Exception {
		// 常规方法
		// InvokeTester test = new InvokeTester();
		//
		// System.out.println(test.add(1, 2));
		// System.out.println(test.echo("Huangxy"));

		// 反射的方法
		Class<?> classType = InvokeTester.class;// 获取一个类Class对象的第二种方式。

		Object invokeTester = classType.newInstance();// 创建Class所指向的类的实例。

		System.out.println(invokeTester instanceof InvokeTester);

		// 1、通过反射调用方法
		// 第一个参数：方法名字；第二个参数：方法参数的class（为何需要第二个参数，因为Java的函数是有重载的。
		Method addMethod = classType.getMethod("add", new Class[] { int.class,
				int.class });
		// 使用invoke调用Method函数
		Object result = addMethod.invoke(invokeTester, new Object[] { 1, 2 });

		System.out.println((Integer) result);

		System.out.println("------------------");
		// 2、通过反射调用第二个方法
		Method echoMethod = classType.getMethod("echo",
				new Class[] { String.class });
		// 使用invoke调用Method函数
		Object result2 = echoMethod.invoke(invokeTester, new Object[] {"Huangxy"});
		
		System.out.println(result2);
	}
}
