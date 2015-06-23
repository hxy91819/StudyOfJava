package observer82.test1;

import java.util.List;
import java.util.ArrayList;

/**
 * 具体的主题角色
 * @author hxy
 *
 */
public class ConcreteWatched implements Watched {
	/**
	 * 存放观察者
	 */
	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatcher(String str) {
		for(Watcher watcher: list){
			watcher.update(str);
		}
	}

}
