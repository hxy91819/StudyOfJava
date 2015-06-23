package Singleton25;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton s = new Singleton();//the constructor Singleton() is not
		// visible
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton.equals(singleton2)){
			System.out.println("true");
		}
		if(singleton == singleton2){
			System.out.println("true");//证明单例成功了
		}
	}

}

/**
 * 单例模式
 * 只返回为一个一个对象。
 * @author Administrator
 * 
 */
class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	/**
	 * 提供外部调用的获取对象方法。
	 * @return
	 */
	public static Singleton getInstance() {
		//静态的方法只能访问静态属性
		return singleton;
	}
}

/**
 * 单例模式2
 * 只返回为一个一个对象。
 * 只有在多线程的情况下才有区别。
 * @author Administrator
 * 
 */
class Singleton2 {
	private static Singleton2 singleton;

	private Singleton2() {

	}

	/**
	 * 提供外部调用的获取对象方法。
	 * @return
	 */
	public static Singleton2 getInstance() {
		if(singleton == null){
			singleton = new Singleton2();
		}
		//静态的方法只能访问静态属性
		return singleton;
	}
}