package proxy65.staticway;


/**
 * 代理角色
 * 中介
 * @author Administrator
 *
 */
public class ProxySubject extends Subject {
	private RealSubject realSubject;//代理角色内部引用了真实角色
	
	@Override
	public void request() {
		this.preRequest();//在真实角色操作之前附加的动作
		
		if (null == realSubject) {
			realSubject = new RealSubject();
		}
		
		realSubject.request();//真实角色所完成的事情。
		
		this.postRequest();//在真实角色操作之后附加的动作。
	}
	
	//以下是代理附加的动作。
	
	private void preRequest(){
		System.out.println("pre Requset by Proxy!");
	}
	
	private void postRequest(){
		System.out.println("post Requset by Proxy!");
	}
}
