package Annotation69;

/**
 * ����д�ĺ�������ʹ��ע��
 * @author Trasen
 *
 */
public class OverrideTest {
//	@Override
//	public String tostring(){//��ʱ�ᱨ��ģ�������д��ʱ��ƴд����
//		return "This is OverrideTest";
//	}
	
	@Override
	public String toString(){//��ȷ����д
		return "This is OverrideTest";
	}
	
	public static void main(String[] args) {
		OverrideTest test = new OverrideTest();
		
		System.out.println(test);
	}
}
