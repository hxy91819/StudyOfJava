package proxy65.dynamicway;

/**
 * ��Ҫ�������
 * @author Administrator
 *
 */
public class RealSubject implements Subject {
	@Override
	public void request() {
		System.out.println("From real subject");
	}
}
