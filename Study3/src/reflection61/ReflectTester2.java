package reflection61;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ���������ķ���
 * ����ÿһ�ж���ȫ����⡣
 * @author Administrator
 *
 */
public class ReflectTester2 {
	/**
	 * �÷���ʵ�ֶ�Customer����Ŀ�������
	 * ��ԭ�ж����е�����ֵ�������������ŵ�һ���µĶ����з��س�����
	 * @param object
	 * @return
	 */
	public Object copy(Object object) throws Exception{
		Class<?> classType = object.getClass();
		
		Object objectCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[] {});
		
		// ��ȡ��������г�Ա����(����˽�е�)
		Field[] fields = classType.getDeclaredFields();
		
		for(Field field : fields){
			String name = field.getName();//��ȡ��������
			
			//�����Ե�����ĸת��Ϊ��д
			String firstLetter = name.substring(0, 1).toUpperCase();//��ȡ0-1����ģ�������ߣ��������ұߣ�
			
			//��ȡ��������
			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodeName = "set" + firstLetter + name.substring(1);
			
			//��ȡ����
			Method getMethod = classType.getMethod(getMethodName, 
					new Class[]{});
			Method setMethod = classType.getMethod(setMethodeName, 
					new Class[]{field.getType()});
			
			
			//��ԭ�ж����е�����ֵ�������������ŵ�һ���µĶ����з��س�����
			Object value = getMethod.invoke(object, new Object[] {});
			
			setMethod.invoke(objectCopy, new Object[] {value});
		}
		
		return objectCopy;
	}
	
	public static void main(String[] args) throws Exception {
		ReflectTester2 tester2 = new ReflectTester2();
		
		Customer customer = new Customer("Tom",20);
		customer.setId(1L);//����Long���͡�Ҳ��ʹ��new Long(1)
		
		Customer customer2 = (Customer)tester2.copy(customer);
		
		System.out.println(customer2.getId() + "," 
		+ customer2.getName() + "," + customer2.getAge());
	}
}
