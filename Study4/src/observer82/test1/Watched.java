package observer82.test1;

/**
 * ���������ɫ�����۲�ģ�
 * @author hxy
 *
 */
public interface Watched {
	/**
	 * ���ӹ۲���
	 * @param watcher
	 */
	public void addWatcher(Watcher watcher);
	/**
	 * �Ƴ��۲���
	 * @param watcher
	 */
	public void removeWatcher(Watcher watcher);
	/**
	 * ֪ͨ�۲���
	 * @param str
	 */
	public void notifyWatcher(String str);
}
