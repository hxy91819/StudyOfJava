package proxy65.staticway;
/**
 * ��ʵ�ض���
 * ����
 * @author Administrator
 *
 */
public class RealSubject extends Subject {
	@Override
	public void request() {
		System.out.println("From real subject.");
	}
}
