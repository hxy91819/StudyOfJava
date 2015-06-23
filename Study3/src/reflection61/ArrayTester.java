package reflection61;

import java.lang.reflect.Array;

/**
 * �˽�java.lang.reflect.Array
 * @author Administrator
 *
 */
public class ArrayTester {
	public static void main(String[] args) throws Exception {
		Class<?> classType = Class.forName("java.lang.String");
		
		Object array = Array.newInstance(classType, 10);//����һ���ַ������飬����Ϊ10
		
		Array.set(array, 5, "huangxy");
		
		String string = (String)Array.get(array, 5);
		
		System.out.println(string);
	}
}
