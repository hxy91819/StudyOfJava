package ArrayList;
import java.util.ArrayList;

/**
 * ��������
 * @author hxy
 *
 */
public class ArrayListTest39
{

	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("TestINfo");
		arrayList.add("World");
		arrayList.add("ddd");
		arrayList.add("welcome");//����Ԫ��
		
		String s1 = (String)arrayList.get(0);
		String s2 = (String)arrayList.get(1);
		String s3 = (String)arrayList.get(2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("----------------");
		
		for(int i = 0; i< arrayList.size(); i ++){//��ȡ���鳤��
			System.out.println(arrayList.get(i));
		}
		
//		arrayList.clear();
		
//		System.out.println(arrayList.size());
		
//		System.out.println(arrayList.isEmpty());
		
		System.out.println("----------------");
		
		arrayList.remove(0);//�Ƴ�Ԫ��
		
		arrayList.remove("welcome");
		
		for(int i = 0; i< arrayList.size(); i ++){
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("-----------------");
		
		arrayList.add("aaa");
		arrayList.add("bbb");
		
		System.out.println(arrayList.indexOf("aaa"));//��ȡ�������
		
	}

}
