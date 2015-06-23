package Annotation69.my;

/**
 * 测试自定义注解
 * 
 * @author Trasen
 * 
 */
@AnnotationTest(value2 = EnumTest.Welcome)
public class AnnotationUsage
{
	@AnnotationTest(value1 = { "world", "Hello" }, value2 = EnumTest.Welcome)
	public void method()
	{
		System.out.println("usage of annotation!");
	}

	@AnnotationTest(value1 = "world", value2 = EnumTest.Welcome)
	public static void main(String[] args)
	{
		AnnotationUsage usage = new AnnotationUsage();

		usage.method();
	}
}
