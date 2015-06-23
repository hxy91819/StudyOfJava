package innerclass85;

import java.util.Date;

public class AnonymousInnerClassTest {
	@SuppressWarnings("deprecation")
	public String get(Date date){
		return date.toLocaleString();
	}
	
	public static void main(String[] args) {
		AnonymousInnerClassTest test = new AnonymousInnerClassTest();
		//直接的调用方式
//		String str = test.get(new Date());
//		
//		System.out.println(str);
		
		//使用匿名的内部类来实现
		String str = test.get(new Date(){
			public String toLocaleString(){//隐式地继承了Date，并重写了toLocaleString方法。
				return "hello world";
			}
		});
		
		System.out.println(str);
	}
}
