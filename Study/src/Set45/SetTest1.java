package Set45;

import java.util.HashSet;

/**
 * HashSet：1、内容不能重复。2、无序。
 * @author hxy
 *
 */
public class SetTest1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set);
		
		System.out.println(set.add("a"));//添加失败。
		System.out.println(set);
	}
}
