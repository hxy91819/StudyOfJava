package reflection61;
/**
 * ���ʹ�÷���ֻ��˽�з���
 * ������Դ�����ķ�װ��
 * ���������ڲ���˽�з���
 * @author Administrator
 *
 */
public class PrivateClass {
	private String name = "zhangsan";
	
	private String sayHello(String name){
		return "Hello, " + name;
	}
	
	public String getName(){
		return name;
	}
}
