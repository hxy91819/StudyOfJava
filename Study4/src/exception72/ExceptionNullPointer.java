package exception72;

public class ExceptionNullPointer {
	public static void main(String[] args) {
		String str = null;//java.lang.NullPointerException ��ָ���쳣����һ������ʱ�쳣������Ƶ����ߵ��쳣��
		
		System.out.println(str.length());
	}
}
