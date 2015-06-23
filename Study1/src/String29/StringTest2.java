package String29;
import other.*;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = " world";
		String s3 = s1 + s2;

		System.out.println(s3);
		
		String s4 = new String("CCC");
		String s5 = "CCC";
		System.out.println(s4 == s5);
		
		System.out.println("--------------");
		
		String s6 = "aaa";
		
		System.out.println(s6.intern());
		
		System.out.println("--------------");
		
        String hello = "Hello", lo = "lo";
        System.out.print((hello == "Hello") + " ");
        System.out.print((Other.hello == hello) + " ");
        System.out.print((other.Other.hello == hello) + " ");
        System.out.print((hello == ("Hel"+"lo")) + " ");
        System.out.print((hello == ("Hel"+lo)) + " ");
        System.out.println(hello == ("Hel"+lo).intern());

	}

}

class Other { static String hello = "Hello"; }

