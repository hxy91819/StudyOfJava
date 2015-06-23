package Object28;

public class ObjectTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object1 = new Object();
		Object object2 = new Object();
		System.out.println(object1 == object2);//false
		
		System.out.println("-----------------");
		//引用类型声明
		String string = new String("aaabbbcccddd");
		String string2 = new String("aaabbbcccddd");
		System.out.println(string == string2);//false
		
		System.out.println("-----------------");
		//值类型声明
		String str = "aaa";
		String str2 = "aaa";
		System.out.println(str == str2);//true
		
		System.out.println("-----------------");
		String str3 = new String("aaa");
		String str4 = "aaa";
		System.out.println(str3 == str4);//false
		
		System.out.println("-----------------");
		//混淆点1
		String str5 = "hello";
		String str6 = "hel";
		String str7 = "lo";
		System.out.println(str5 == str6 + str7);//false
		System.out.println(str5.equals(str6 + str7));//true
		
		System.out.println("-----------------");
		//混淆点2
		String str8 = "hello";
		System.out.println(str8 == "hel" + "lo");//true
	}

}
