package observer82.test1;

/**
 * ������
 * �۲���ģʽ��Ҫ���õ��˶�̬
 * ��ť�¼���������ʵ��ԭ��
 * @author hxy
 *
 */
public class Test {

	public static void main(String[] args) {
		Watched girl = new ConcreteWatched();
		
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		
		girl.notifyWatcher("����");
		
		System.out.println("---------------------");
		
		girl.removeWatcher(watcher2);
		
		girl.notifyWatcher("�ѹ�");
		
	}

}
