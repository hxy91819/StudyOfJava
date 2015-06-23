package LinkList41;

import java.util.LinkedList;

/**
 * 线性表、链表（链表并非连续存放的） ArrayList是顺序表，在内存中是连续存放的。
 * 
 * @author hxy
 * 
 */
public class LinkedListTest1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add("F");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("C");
		list.add("B");
		list.add("A");

		list.addLast("Last");
		list.addFirst("First");

		list.add(1, "A2");// 在某个位置增加

		System.out.println("最初的集合：" + list);

		list.remove("F");// 删除靠前的那个

		list.remove("PP");// 没有的话不会删除任何东西

		list.remove(2);// 移除序号为2的。

		System.out.println("变化之后的集合：" + list);

		Object value = list.get(2);
		list.set(2, (String) value + "changed");// 改变某值

		System.out.println("最后的集合为：" + list);
	}
}
