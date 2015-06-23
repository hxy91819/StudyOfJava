package proxy65.staticway;


/**
 * �����ɫ
 * �н�
 * @author Administrator
 *
 */
public class ProxySubject extends Subject {
	private RealSubject realSubject;//�����ɫ�ڲ���������ʵ��ɫ
	
	@Override
	public void request() {
		this.preRequest();//����ʵ��ɫ����֮ǰ���ӵĶ���
		
		if (null == realSubject) {
			realSubject = new RealSubject();
		}
		
		realSubject.request();//��ʵ��ɫ����ɵ����顣
		
		this.postRequest();//����ʵ��ɫ����֮�󸽼ӵĶ�����
	}
	
	//�����Ǵ����ӵĶ�����
	
	private void preRequest(){
		System.out.println("pre Requset by Proxy!");
	}
	
	private void postRequest(){
		System.out.println("post Requset by Proxy!");
	}
}
