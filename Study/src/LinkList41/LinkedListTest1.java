package LinkList41;

import java.util.LinkedList;

/**
 * ���Ա�����������������ŵģ� ArrayList��˳������ڴ�����������ŵġ�
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

		list.add(1, "A2");// ��ĳ��λ������

		System.out.println("����ļ��ϣ�" + list);

		list.remove("F");// ɾ����ǰ���Ǹ�

		list.remove("PP");// û�еĻ�����ɾ���κζ���

		list.remove(2);// �Ƴ����Ϊ2�ġ�

		System.out.println("�仯֮��ļ��ϣ�" + list);

		Object value = list.get(2);
		list.set(2, (String) value + "changed");// �ı�ĳֵ

		System.out.println("���ļ���Ϊ��" + list);
	}
}
