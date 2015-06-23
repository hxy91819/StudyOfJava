package observer82.test1;

import java.util.List;
import java.util.ArrayList;

/**
 * ����������ɫ
 * @author hxy
 *
 */
public class ConcreteWatched implements Watched {
	/**
	 * ��Ź۲���
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
