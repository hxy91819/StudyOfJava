package observer82.test1;

/**
 * ����Ĺ۲���
 * @author hxy
 *
 */
public class ConcreteWatcher implements Watcher {
	@Override
	public void update(String str) {
		System.out.println(str);
	}
}
