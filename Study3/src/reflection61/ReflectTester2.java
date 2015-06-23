package reflection61;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射完整的范例
 * 必须每一行都完全的理解。
 * @author Administrator
 *
 */
public class ReflectTester2 {
	/**
	 * 该方法实现对Customer对象的拷贝操作
	 * 将原有对象中的属性值拷贝出来，并放到一个新的对象中返回出来。
	 * @param object
	 * @return
	 */
	public Object copy(Object object) throws Exception{
		Class<?> classType = object.getClass();
		
		Object objectCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[] {});
		
		// 获取对象的所有成员变量(包括私有的)
		Field[] fields = classType.getDeclaredFields();
		
		for(Field field : fields){
			String name = field.getName();//获取所有属性
			
			//将属性的首字母转换为大写
			String firstLetter = name.substring(0, 1).toUpperCase();//获取0-1区间的（包含左边，不包含右边）
			
			//获取方法名字
			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodeName = "set" + firstLetter + name.substring(1);
			
			//获取方法
			Method getMethod = classType.getMethod(getMethodName, 
					new Class[]{});
			Method setMethod = classType.getMethod(setMethodeName, 
					new Class[]{field.getType()});
			
			
			//将原有对象中的属性值拷贝出来，并放到一个新的对象中返回出来。
			Object value = getMethod.invoke(object, new Object[] {});
			
			setMethod.invoke(objectCopy, new Object[] {value});
		}
		
		return objectCopy;
	}
	
	public static void main(String[] args) throws Exception {
		ReflectTester2 tester2 = new ReflectTester2();
		
		Customer customer = new Customer("Tom",20);
		customer.setId(1L);//代表Long类型。也可使用new Long(1)
		
		Customer customer2 = (Customer)tester2.copy(customer);
		
		System.out.println(customer2.getId() + "," 
		+ customer2.getName() + "," + customer2.getAge());
	}
}
