package ArrayList;
import java.util.ArrayList;

/**
 * 类型转换相关
 * @author hxy
 *
 */
public class ArrayListTest2
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add("hello");
		list.add(new Integer(2));
		
		String str = (String)list.get(0);
		
		Integer in = (Integer)list.get(1);
		
		System.out.println(str);
		System.out.println(in.intValue());
		
		System.out.println("--------------------");
		
		ArrayList list2 = new ArrayList();
//		list2.add(3);//只能放置对象，不能放置原生数据类型。只能转换为包装类型，如int——Integer
		list2.add(new Integer(3));
		list2.add(new Integer(4));
		list2.add(new Integer(5));
		list2.add(new Integer(6));
		
		int sum = 0;
		
		for(int i = 0; i < list2.size(); i ++){
			int value = ((Integer)list2.get(i)).intValue();
			
			sum += value;
		}
		
		System.out.println(sum);
	}
}
