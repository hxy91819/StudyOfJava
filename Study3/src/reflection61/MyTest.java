package reflection61;

/**
 * JDK�ϵĲ��԰���
 * 
 * @author Administrator
 * 
 */
public class MyTest {
	static void printClassName(Object object) {
		System.out.println("The class of " + object + " is "
				+ object.getClass().getName());
	}
	
	public static void main(String[] args) {
		String sssString = "abc";
		printClassName(sssString);
	}
}
