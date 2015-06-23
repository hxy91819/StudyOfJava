package String29;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello").append(" world");
		System.out.println(buffer);

		String s = "abc";
		int a = 100;
		boolean b = true;

		String str = s + a + b;

		System.out.println(str);

		System.out.println("-----------------");

		int m = 100;
		int n = 200;
		System.out.println(100 + 200);
		System.out.println(m + n);
		System.out.println("100" + 200);
	}
}
