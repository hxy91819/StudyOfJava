package String29.myTest;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "bcd";
		String str4 = "Abc";
		
		//��ȡĳ�����λ�õ��ַ���
		System.out.println("str1 charAt 2" + str1.charAt(2));
//		System.out.println(str1[2]);//C#�е������÷��ǲ��е�
		
		System.out.println("----------------");
		
		//�Ƚ�
		System.out.println("str1 compareTo str2:" + str1.compareTo(str2));
		System.out.println("str1 compareTo str3:" + str1.compareTo(str3));
		
		System.out.println("-----------------");
		
		//�����Ǵ�Сд�ıȽ�
		System.out.println("str1 compareIgnoreCase str4:" + str1.compareToIgnoreCase(str4));
		
		System.out.println("------------------");
		
		//����
		System.out.println(str1.concat(str3));
		System.out.println(str1 + str3);
		
		System.out.println("------------------");
		
		//�ж��Ƿ���ĳ�ַ�������
		System.out.println(str1.endsWith(str4));
		System.out.println(str1.endsWith(str2));
		System.out.println(str1.endsWith(str3));
		
		System.out.println("-------------------");
		
		System.out.println(str1.length());
		
		System.out.println("-------------------");
		
		//��ȡ�ַ���(Java�е����䶨��Ϊ����ǰ������������)
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1, 2));
		System.out.println(str1.substring(1, 3));
	}
}
