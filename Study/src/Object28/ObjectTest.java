package Object28;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();

		System.out.println(object);
		System.out.println(object.toString());// �ȼ�

		String string = "aaa";
		System.out.println("ֵ����" + string);//

		Student student = new Student();
		System.out.println("��������" + student);
		
		Me me = new Me();
		System.out.println("ֵ����" + me);
	}

}

class Student {

}

class Me{
	public String toString(){
		return "Hello world!";
	}
}