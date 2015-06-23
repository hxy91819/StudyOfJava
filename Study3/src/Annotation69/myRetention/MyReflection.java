package Annotation69.myRetention;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ��ȡע��ķ����࣬���ʹ���Զ���ע�⣬��������Զ���ע��Ĳ�����
 * 
 * @author Trasen
 * 
 */
public class MyReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyTest myTest = new MyTest();
		
		//ͨ�������ȡĳ����ĳ��������ע����Ϣ
		Class<MyTest> c = MyTest.class;//��ȡ��
		
		Method method = c.getMethod("output", new Class[]{});//��ȡ����output
		
		if(method.isAnnotationPresent(MyAnnotation.class)){//���ע������β���RUNTIME����ô�˴��޷���⵽�����޷�ͨ������ķ�ʽ����ȡ
			System.out.println("ע��MyAnnotation�����ұ����ΪRUNTIME");
			
			method.invoke(myTest, new Object[]{});//���÷���
			
			System.out.println("-----------------------------");
			
			//��ȡע��Ĳ�����Ϣ
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);//��ȡMyAnnotationʵ��
			
			String str1 = myAnnotation.hello();
			String str2 = myAnnotation.world();
			
			System.out.println(str1 + "," + str2);
		} else{
			System.out.println("ע��MyAnnotation�����ڻ�û�б����ΪRUNTIME��");
		}
		
		System.out.println("-----------------------------");
		
		//��ȡ���е�ע��
		Annotation[] annotations = method.getAnnotations();//RetentionPolicyΪRuntime���ܶ�ȡ��
		
		for(Annotation annotation : annotations){
			System.out.println(annotation.annotationType().getName());
		}
	}
}
