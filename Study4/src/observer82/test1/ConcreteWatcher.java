package observer82.test1;

/**
 * 具体的观察者
 * @author hxy
 *
 */
public class ConcreteWatcher implements Watcher {
	@Override
	public void update(String str) {
		System.out.println(str);
	}
}
