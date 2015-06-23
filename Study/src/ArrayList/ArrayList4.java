package ArrayList;

import java.util.ArrayList;

/**
 * 添加自定义对象
 * 
 * @author hxy
 * 
 */
public class ArrayList4
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();

		list.add(new Point(2, 3));
		list.add(new Point(2, 2));
		list.add(new Point(4, 4));

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

		System.out.println(list);
	}
}

