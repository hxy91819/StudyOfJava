package Annotation69.myRetention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * �趨��RUNTIME������ʹ�÷����ȡ����
 * @author Trasen
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation
{
	String hello() default "shengsiyuan";
	
	String world();
}
