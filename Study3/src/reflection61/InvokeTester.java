package reflection61;

import java.lang.reflect.Method;

/**
 * ʹ�÷��������ķ�����
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
		// ���淽��
		// InvokeTester test = new InvokeTester();
		//
		// System.out.println(test.add(1, 2));
		// System.out.println(test.echo("Huangxy"));

		// ����ķ���
		Class<?> classType = InvokeTester.class;// ��ȡһ����Class����ĵڶ��ַ�ʽ��

		Object invokeTester = classType.newInstance();// ����Class��ָ������ʵ����

		System.out.println(invokeTester instanceof InvokeTester);

		// 1��ͨ��������÷���
		// ��һ���������������֣��ڶ�������������������class��Ϊ����Ҫ�ڶ�����������ΪJava�ĺ����������صġ�
		Method addMethod = classType.getMethod("add", new Class[] { int.class,
				int.class });
		// ʹ��invoke����Method����
		Object result = addMethod.invoke(invokeTester, new Object[] { 1, 2 });

		System.out.println((Integer) result);

		System.out.println("------------------");
		// 2��ͨ��������õڶ�������
		Method echoMethod = classType.getMethod("echo",
				new Class[] { String.class });
		// ʹ��invoke����Method����
		Object result2 = echoMethod.invoke(invokeTester, new Object[] {"Huangxy"});
		
		System.out.println(result2);
	}
}
