package Object28;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();

		System.out.println(object);
		System.out.println(object.toString());// 等价

		String string = "aaa";
		System.out.println("值类型" + string);//

		Student student = new Student();
		System.out.println("引用类型" + student);
		
		Me me = new Me();
		System.out.println("值类型" + me);
	}

}

class Student {

}

class Me{
	public String toString(){
		return "Hello world!";
	}
}