package Annotation69.myRetention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 设定在RUNTIME，可以使用反射读取出来
 * @author Trasen
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation
{
	String hello() default "shengsiyuan";
	
	String world();
}
