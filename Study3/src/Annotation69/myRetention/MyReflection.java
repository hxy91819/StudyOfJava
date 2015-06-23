package Annotation69.myRetention;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 读取注解的反射类，如何使用自定义注解，如何利用自定义注解的参数。
 * 
 * @author Trasen
 * 
 */
public class MyReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyTest myTest = new MyTest();
		
		//通过反射读取某个类某个方法的注解信息
		Class<MyTest> c = MyTest.class;//获取类
		
		Method method = c.getMethod("output", new Class[]{});//获取方法output
		
		if(method.isAnnotationPresent(MyAnnotation.class)){//如果注解的修饰不是RUNTIME，那么此处无法检测到，即无法通过反射的方式来获取
			System.out.println("注解MyAnnotation存在且被标记为RUNTIME");
			
			method.invoke(myTest, new Object[]{});//调用方法
			
			System.out.println("-----------------------------");
			
			//获取注解的参数信息
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);//获取MyAnnotation实例
			
			String str1 = myAnnotation.hello();
			String str2 = myAnnotation.world();
			
			System.out.println(str1 + "," + str2);
		} else{
			System.out.println("注解MyAnnotation不存在或没有被标记为RUNTIME！");
		}
		
		System.out.println("-----------------------------");
		
		//获取所有的注解
		Annotation[] annotations = method.getAnnotations();//RetentionPolicy为Runtime才能读取到
		
		for(Annotation annotation : annotations){
			System.out.println(annotation.annotationType().getName());
		}
	}
}
