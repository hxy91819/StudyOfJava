package observer82.test1;

/**
 * 操作类
 * 观察者模式主要是用到了多态
 * 按钮事件监听器的实现原理。
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
		
		girl.notifyWatcher("开心");
		
		System.out.println("---------------------");
		
		girl.removeWatcher(watcher2);
		
		girl.notifyWatcher("难过");
		
	}

}
