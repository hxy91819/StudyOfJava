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
			System.out.println("true");//֤�������ɹ���
		}
	}

}

/**
 * ����ģʽ
 * ֻ����Ϊһ��һ������
 * @author Administrator
 * 
 */
class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	/**
	 * �ṩ�ⲿ���õĻ�ȡ���󷽷���
	 * @return
	 */
	public static Singleton getInstance() {
		//��̬�ķ���ֻ�ܷ��ʾ�̬����
		return singleton;
	}
}

/**
 * ����ģʽ2
 * ֻ����Ϊһ��һ������
 * ֻ���ڶ��̵߳�����²�������
 * @author Administrator
 * 
 */
class Singleton2 {
	private static Singleton2 singleton;

	private Singleton2() {

	}

	/**
	 * �ṩ�ⲿ���õĻ�ȡ���󷽷���
	 * @return
	 */
	public static Singleton2 getInstance() {
		if(singleton == null){
			singleton = new Singleton2();
		}
		//��̬�ķ���ֻ�ܷ��ʾ�̬����
		return singleton;
	}
}