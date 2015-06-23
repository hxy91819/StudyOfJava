package ArrayList;
import java.util.ArrayList;


/**
 * 如何输出一个ArrayList
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
		
		//转换为一个数组
		//Integer[] integers = (Integer[])list.toArray();//直接强制转换数组是不可以的
		
		/*
		 * 不能将Object[]转换为Integer[]
		 * Integer[]是继承于Object而不是Object[]
		 * 如果Object里面有String，那么转换肯定会失败的。
		 */
		
		Object[] in = list.toArray();
		
		for(int i = 0; i < in.length; i ++)
		{
			System.out.println(((Integer)in[i]).intValue());
		}
	}
}
