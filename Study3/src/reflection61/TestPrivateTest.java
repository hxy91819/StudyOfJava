package reflection61;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 测试调用类的私有方法
 * 
 * @author Administrator
 * 
 */
public class TestPrivateTest {
	public static void main(String[] args) throws Exception {
		PrivateClass p = new PrivateClass();

		Class<?> classType = p.getClass();

		// getMethod只能获取public的。
		// Method method = classType.getMethod("sayHello",
		// new Class[] {String.class});

		// getDeclareMethod是可以获取声明过的方法
		Method method = classType.getDeclaredMethod("sayHello",
				new Class[] { String.class });

		method.setAccessible(true);// 压制Java的访问控制检查。

		String str = (String) method.invoke(p, new Object[] { "zhangsan" });

		System.out.println(str);

		// 修改私有属性为name的值为lisi

		Field field = classType.getDeclaredField("name");

		field.setAccessible(true);

		field.set(p, "lisi");

		// field.set(new String(), "lisi");

		System.out.println(p.getName());
	}
}
