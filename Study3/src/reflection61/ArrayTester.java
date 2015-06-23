package reflection61;

import java.lang.reflect.Array;

/**
 * 了解java.lang.reflect.Array
 * @author Administrator
 *
 */
public class ArrayTester {
	public static void main(String[] args) throws Exception {
		Class<?> classType = Class.forName("java.lang.String");
		
		Object array = Array.newInstance(classType, 10);//生成一个字符串数组，长度为10
		
		Array.set(array, 5, "huangxy");
		
		String string = (String)Array.get(array, 5);
		
		System.out.println(string);
	}
}
