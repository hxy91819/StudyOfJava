package proxy65.staticway;
/**
 * 真实地对象
 * 房东
 * @author Administrator
 *
 */
public class RealSubject extends Subject {
	@Override
	public void request() {
		System.out.println("From real subject.");
	}
}
