package StaticAndFinal;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m = new N();
		m.output();//最好使用静态的方法引用，避免此类问题。
	}

}

class W{
	int a = 10;
	public static void change(){
		//a++;//Cannot make a static reference to the non-static field a
	}
}

class M{
	public static void output(){
		System.out.println("M");
	}
}
class N extends M{
	
	public static void output(){
		System.out.println("N");
	}
}