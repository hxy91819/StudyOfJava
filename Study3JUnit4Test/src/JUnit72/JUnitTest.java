package JUnit72;

import org.junit.Test;

/**
 * 使用注解，可以使函数名不必以test开头
 * @author Trasen
 *
 */
public class JUnitTest {
	@Test
	public void hello(){
		System.out.println("hello world");
	}
}
