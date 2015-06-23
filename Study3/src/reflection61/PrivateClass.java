package reflection61;
/**
 * 如何使用反射只用私有方法
 * 反射可以打破类的封装性
 * 往往是用于测试私有方法
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
