package Collection38;

import java.util.LinkedList;

/**
 * ����
 * @author hxy
 *
 */
public class MyQueue {
	private LinkedList list = new LinkedList();
	
	public void put(Object o){
		list.addLast(o);
	}
	
	public Object get(){
		return list.removeFirst();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		
		myQueue.put("one");
		myQueue.put("two");
		myQueue.put("three");
		
		System.out.println(myQueue.get());
		System.out.println(myQueue.get());
		System.out.println(myQueue.get());
		
		System.out.println(myQueue.isEmpty());
	}
}
