package reflection61;

import java.lang.reflect.Method;

/**
 * ���䣨�����ڵ���Ϊ����������ʶ��
 * @author Administrator
 *
 */
public class DumpMethods {
	public static void main(String[] args) throws Exception {//��������ʱ����
		Class<?> classType = Class.forName("java.lang.Object");//�����ֻ�ȡĳ����
		
		Method[] methods = classType.getDeclaredMethods();//��ȡ���еķ���
		
		for(Method method: methods){//��������
			System.out.println(method);
		}
	}
}
