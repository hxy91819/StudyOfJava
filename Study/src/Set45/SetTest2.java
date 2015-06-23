package Set45;

import java.util.HashSet;

/**
 * ����Add������ʱ�ܹ����ӳɹ���(e==null ? e2 == null : e.equals(e2)) ������ͬ���ַ�����������ʧ�ܡ�
 * 
 * @author hxy
 * 
 */
public class SetTest2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		System.out.println(set.add(new People("zhangsan")));
		System.out.println(set.add(new People("lisi")));
		System.out.println(set.add(new People("zhangsan")));

		System.out.println(set);

		System.out.println("--------------------");
		set.clear();

		People p1 = new People("zhangsan");

		System.out.println(set.add(p1));
		System.out.println(set.add(p1));

		System.out.println(set);

		System.out.println("--------------------");
		set.clear();

		String s1 = new String("a");
		String s2 = new String("a");

		System.out.println(set.add(s1));
		System.out.println(set.add(s2));

		System.out.println(set);
	}
}

class People {
	String name;

	public People(String name) {
		this.name = name;
	}
}