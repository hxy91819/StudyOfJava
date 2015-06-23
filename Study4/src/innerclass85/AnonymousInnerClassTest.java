package innerclass85;

import java.util.Date;

public class AnonymousInnerClassTest {
	@SuppressWarnings("deprecation")
	public String get(Date date){
		return date.toLocaleString();
	}
	
	public static void main(String[] args) {
		AnonymousInnerClassTest test = new AnonymousInnerClassTest();
		//ֱ�ӵĵ��÷�ʽ
//		String str = test.get(new Date());
//		
//		System.out.println(str);
		
		//ʹ���������ڲ�����ʵ��
		String str = test.get(new Date(){
			public String toLocaleString(){//��ʽ�ؼ̳���Date������д��toLocaleString������
				return "hello world";
			}
		});
		
		System.out.println(str);
	}
}
