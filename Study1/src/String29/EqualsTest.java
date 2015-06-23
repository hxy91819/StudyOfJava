package String29;

/**
 * 重写equals方法
 * @author Administrator
 *
 */
public class EqualsTest {

	public static void main(String[] args) {
		Student s1 = new Student("ZhangSan");
		Student s2 = new Student("ZhangSan");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}

class Student{
	String name;
	
	public Student(String name){
		this.name = name;
	}
	/**
	 * 重写equals方法，模仿String的写法
	 */
	public boolean equals(Object anObject){
		if(this == anObject){
			return true;
		}
		if (anObject instanceof Student) {
			Student anotherStudent = (Student)anObject;
			
			if (this.name.equals(anotherStudent.name)) {
				return true;
			}
		}
		return false;
	}
}