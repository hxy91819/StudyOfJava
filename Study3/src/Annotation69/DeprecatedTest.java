package Annotation69;

import java.util.Date;

public class DeprecatedTest {
	public static void main(String[] args) {
//		Date date = new Date();
//		
//		System.out.println(date.toLocaleString());//本地时间表示方式。
		
		//So，如何标记方法是不建议被使用的？（类似C#的特性）
		
		DeprecatedTest test = new DeprecatedTest();
		
		test.doSomething();
	}
	
	@Deprecated
	public void doSomething(){
		System.out.println("Do Something!");
	}
}
