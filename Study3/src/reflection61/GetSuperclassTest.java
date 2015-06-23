package reflection61;

public class GetSuperclassTest {
	public static void main(String[] args) {
		Class<?> classType = Child.class;
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);//null
		
		System.out.println("-------------");
		
		Class c1 = Boolean.TYPE;
		
		System.out.println(c1);
	}
}

class Parent{
	
}

class Child extends Parent{
	
}