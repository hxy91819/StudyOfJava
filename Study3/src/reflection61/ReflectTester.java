package reflection61;

import java.lang.reflect.Constructor;

/**
 * ͨ���������һ���ࡣ
 * @author Administrator
 *
 */
public class ReflectTester {
	/**
	 * �÷���ʵ�ֶ�Customer����Ŀ�������
	 * ��ԭ�ж����е�����ֵ�������������ŵ�һ���µĶ����з��س�����
	 * �����ReflectTester2
	 * @param object
	 * @return
	 */
	public Object copy(Object object) throws Exception {
		Class<?> classType = object.getClass();//��ȡClass�ĵ����ַ���
		
		//��ȡ���췽�������ݴ˹��췽���������󣨿ɴ�������
		Constructor constructor = classType.getConstructor(new Class[]{String.class, int.class});
		
		Object obj = constructor.newInstance(new Object[]{"hello", 3});
		
		//ʹ��Class����������ֻ�ܵ��ò��������Ĺ��췽����
		Object obj2 = classType.newInstance();//ֻ�ܸ�����Ĳ����ܲ����ķ������������
		
		
		//Print
		System.out.println(obj);
		
		System.out.println(obj2);
		
		return null;
	}
	
	public static void main(String[] args)throws Exception {
		ReflectTester test = new ReflectTester();
		
		test.copy(new Customer());
	}
}

class Customer{
	private Long id;
	
	private String name;
	
	private int age;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public Customer(){
		
	}
	
	public Customer(String name, int age){
		this.name = name;
		this.age = age;
	}
}