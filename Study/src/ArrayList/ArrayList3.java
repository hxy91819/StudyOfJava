package ArrayList;
import java.util.ArrayList;


/**
 * ������һ��ArrayList
 * @author hxy
 *
 */
public class ArrayList3
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		
		//ת��Ϊһ������
		//Integer[] integers = (Integer[])list.toArray();//ֱ��ǿ��ת�������ǲ����Ե�
		
		/*
		 * ���ܽ�Object[]ת��ΪInteger[]
		 * Integer[]�Ǽ̳���Object������Object[]
		 * ���Object������String����ôת���϶���ʧ�ܵġ�
		 */
		
		Object[] in = list.toArray();
		
		for(int i = 0; i < in.length; i ++)
		{
			System.out.println(((Integer)in[i]).intValue());
		}
	}
}
