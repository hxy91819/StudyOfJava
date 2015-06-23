package exception72.customexception;

/**
 * 测试自定义异常
 * 
 * @author hxy
 * 
 */
public class MyExceptionTest {
	public void method(String str) throws MyException, MyException2, Exception {
		if (null == str) {
			throw new MyException("传入的字符串str不能为null");
			
		} else if(str.equals("hello")) {
			throw new MyException2("传入的字符串不能为hello");
		}
		else {
			System.out.println(str);
		}
	}
	
	/**
	 * 在main方法处抛出异常，会让JVM来处理。
	 * @param args
	 */
	public static void main(String[] args) {
		MyExceptionTest test = new MyExceptionTest();
		
		String str = "hello";
		
		//可以有两个catch块，但是顶多只有一个块可以进入。
		try {
			test.method(str);
		} catch (MyException e) {
			System.out.println("进入MyExcetpion块");
			e.printStackTrace();
		} catch (MyException2 e) {
			System.out.println("进入MyExcetpion2块");
			e.printStackTrace();
		} catch (Exception e) {//Exception只能放在这个位置，否则会造成其他子类无法截取到。
			System.out.println("进入Exception块");
			e.printStackTrace();
		}finally{
			System.out.println("finally...异常处理完毕");
		}

		System.out.println("try...catch...finally程序块执行完毕");
	}
}
