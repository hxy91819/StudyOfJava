package Annotation69.myDocumented;

import java.lang.annotation.Documented;

/**
 * 表示这个注解会生成到javadoc中
 * @author Trasen
 *
 */
@Documented
public @interface DocumentedAnnotation {
	String hello();
}
