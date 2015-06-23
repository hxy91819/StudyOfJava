package proxy65.staticway;

/**
 * µ÷ÓÃ·½
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		
		subject.request();
	}
}
