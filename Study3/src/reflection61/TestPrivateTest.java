package reflection61;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ���Ե������˽�з���
 * 
 * @author Administrator
 * 
 */
public class TestPrivateTest {
	public static void main(String[] args) throws Exception {
		PrivateClass p = new PrivateClass();

		Class<?> classType = p.getClass();

		// getMethodֻ�ܻ�ȡpublic�ġ�
		// Method method = classType.getMethod("sayHello",
		// new Class[] {String.class});

		// getDeclareMethod�ǿ��Ի�ȡ�������ķ���
		Method method = classType.getDeclaredMethod("sayHello",
				new Class[] { String.class });

		method.setAccessible(true);// ѹ��Java�ķ��ʿ��Ƽ�顣

		String str = (String) method.invoke(p, new Object[] { "zhangsan" });

		System.out.println(str);

		// �޸�˽������Ϊname��ֵΪlisi

		Field field = classType.getDeclaredField("name");

		field.setAccessible(true);

		field.set(p, "lisi");

		// field.set(new String(), "lisi");

		System.out.println(p.getName());
	}
}
