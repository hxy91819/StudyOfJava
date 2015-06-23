package Annotation69;

/**
 * 在重写的函数上面使用注解
 * @author Trasen
 *
 */
public class OverrideTest {
//	@Override
//	public String tostring(){//此时会报错的，避免重写的时候，拼写出错。
//		return "This is OverrideTest";
//	}
	
	@Override
	public String toString(){//正确的重写
		return "This is OverrideTest";
	}
	
	public static void main(String[] args) {
		OverrideTest test = new OverrideTest();
		
		System.out.println(test);
	}
}
