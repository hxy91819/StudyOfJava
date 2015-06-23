package Annotation69.myTarget;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 限定注解的使用范围
 * @author Trasen
 *
 */
@Target(ElementType.METHOD)
public @interface MyTarget {
	String value();
}
