package proxy65.dynamicway;

/**
 * 需要代理的类
 * @author Administrator
 *
 */
public class RealSubject implements Subject {
	@Override
	public void request() {
		System.out.println("From real subject");
	}
}
