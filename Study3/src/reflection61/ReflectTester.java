package reflection61;

import java.lang.reflect.Constructor;

/**
 * 通过反射操纵一个类。
 * @author Administrator
 *
 */
public class ReflectTester {
	/**
	 * 该方法实现对Customer对象的拷贝操作
	 * 将原有对象中的属性值拷贝出来，并放到一个新的对象中返回出来。
	 * 详见：ReflectTester2
	 * @param object
	 * @return
	 */
	public Object copy(Object object) throws Exception {
		Class<?> classType = object.getClass();//获取Class的第三种方法
		
		//获取构造方法并根据此构造方法创建对象（可带参数）
		Constructor constructor = classType.getConstructor(new Class[]{String.class, int.class});
		
		Object obj = constructor.newInstance(new Object[]{"hello", 3});
		
		//使用Class来创建对象（只能调用不带参数的构造方法）
		Object obj2 = classType.newInstance();//只能根据类的不接受参数的方法来构造对象。
		
		
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