package com.hxy.stringTest;

public class StringTest {
    public static void main(String[] args) {
        StringTest test = new StringTest();
        test.stringTest();
        System.out.println("------------------");
        test.stringTest2();
    }

    public void stringTest() {
        String a = "a" + "b" + 1;
        String b = "ab1";
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public void stringTest2() {
        String a = new String("ab1");
        String b = "ab1";
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
