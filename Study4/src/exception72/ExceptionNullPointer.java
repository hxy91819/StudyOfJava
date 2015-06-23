package exception72;

public class ExceptionNullPointer {
	public static void main(String[] args) {
		String str = null;//java.lang.NullPointerException 空指针异常，是一种运行时异常。出现频率最高的异常。
		
		System.out.println(str.length());
	}
}
