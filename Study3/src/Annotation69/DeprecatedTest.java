package Annotation69;

import java.util.Date;

public class DeprecatedTest {
	public static void main(String[] args) {
//		Date date = new Date();
//		
//		System.out.println(date.toLocaleString());//����ʱ���ʾ��ʽ��
		
		//So����α�Ƿ����ǲ����鱻ʹ�õģ�������C#�����ԣ�
		
		DeprecatedTest test = new DeprecatedTest();
		
		test.doSomething();
	}
	
	@Deprecated
	public void doSomething(){
		System.out.println("Do Something!");
	}
}
