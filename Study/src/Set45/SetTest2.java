package Set45;

import java.util.HashSet;

/**
 * 测试Add方法何时能够增加成功。(e==null ? e2 == null : e.equals(e2)) 所以相同的字符串会造成添加失败。
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