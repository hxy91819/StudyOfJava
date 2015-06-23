package reflection61;

import java.lang.reflect.Method;

/**
 * 反射（运行期的行为），入门认识。
 * @author Administrator
 *
 */
public class DumpMethods {
	public static void main(String[] args) throws Exception {//这句代码暂时不管
		Class<?> classType = Class.forName("java.lang.Object");//按名字获取某个类
		
		Method[] methods = classType.getDeclaredMethods();//获取类中的方法
		
		for(Method method: methods){//遍历方法
			System.out.println(method);
		}
	}
}
