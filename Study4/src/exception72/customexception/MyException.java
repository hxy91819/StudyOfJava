package exception72.customexception;

/**
 * 自定义异常类
 * 参考JDK的异常类
 * @author hxy
 *
 */
public class MyException extends Exception {
	public MyException() {
		super();
	}
	
	public MyException(String message){
		super(message);
	}
}
