package Annotation69.myTarget;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * �޶�ע���ʹ�÷�Χ
 * @author Trasen
 *
 */
@Target(ElementType.METHOD)
public @interface MyTarget {
	String value();
}
