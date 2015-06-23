package observable84.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * �������
 * @author hxy
 *
 */
class BeginWatched extends Observable{
	void counter(int number){
		for(; number >= 0; number--){
			this.setChanged();
			
			this.notifyObservers(number);
		}
	}
}

/**
 * �۲���1
 * @author hxy
 *
 */
class Watcher1 implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Watcher1's count is : " +  arg);
	}
}

class Watcher2 implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		if(((Integer)arg).intValue() <= 5){//С��5��ʱ��Ŵ�ӡ����
			System.out.println("Watcher2's count is : " + arg);
		}
	}
}

public class TwoObservers {
	public static void main(String[] args) {
		BeginWatched watched = new BeginWatched();
		
		Watcher1 watcher1 = new Watcher1();
		Watcher2 watcher2 = new Watcher2();
		
		watched.addObserver(watcher1);
		watched.addObserver(watcher2);
		
		watched.counter(10);
		//�����ӵĻ���ִ��
//		watched.counter(4);
	}
}
