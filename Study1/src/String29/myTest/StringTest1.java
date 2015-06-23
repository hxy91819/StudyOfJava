package String29.myTest;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "bcd";
		String str4 = "Abc";
		
		//获取某个序号位置的字符串
		System.out.println("str1 charAt 2" + str1.charAt(2));
//		System.out.println(str1[2]);//C#中的这种用法是不行的
		
		System.out.println("----------------");
		
		//比较
		System.out.println("str1 compareTo str2:" + str1.compareTo(str2));
		System.out.println("str1 compareTo str3:" + str1.compareTo(str3));
		
		System.out.println("-----------------");
		
		//不考虑大小写的比较
		System.out.println("str1 compareIgnoreCase str4:" + str1.compareToIgnoreCase(str4));
		
		System.out.println("------------------");
		
		//联接
		System.out.println(str1.concat(str3));
		System.out.println(str1 + str3);
		
		System.out.println("------------------");
		
		//判断是否以某字符串结束
		System.out.println(str1.endsWith(str4));
		System.out.println(str1.endsWith(str2));
		System.out.println(str1.endsWith(str3));
		
		System.out.println("-------------------");
		
		System.out.println(str1.length());
		
		System.out.println("-------------------");
		
		//截取字符串(Java中的区间定义为包含前部，不包含后部)
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1, 2));
		System.out.println(str1.substring(1, 3));
	}
}
