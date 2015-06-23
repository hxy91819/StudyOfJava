package Annotation69.my;

/**
 * 自定义注解
 * 如果什么都不做，就是一个Maker Annotation
 * @author Trasen
 *
 */
public @interface AnnotationTest {
	String[] value1() default "hello";//类似属性
	EnumTest value2();
}

enum EnumTest{
	Hello, World, Welcome;
}