package observer82.test1;

/**
 * 抽象主题角色（被观察的）
 * @author hxy
 *
 */
public interface Watched {
	/**
	 * 增加观察者
	 * @param watcher
	 */
	public void addWatcher(Watcher watcher);
	/**
	 * 移除观察者
	 * @param watcher
	 */
	public void removeWatcher(Watcher watcher);
	/**
	 * 通知观察者
	 * @param str
	 */
	public void notifyWatcher(String str);
}
