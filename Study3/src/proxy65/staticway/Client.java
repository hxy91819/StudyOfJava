package proxy65.staticway;

/**
 * ���÷�
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		
		subject.request();
	}
}
