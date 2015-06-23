package LinkList41;
/**
 * 构造一个双向循环链表
 * LinkedList底层的实现方法。
 * @author hxy
 *
 */
public class NodeTest2 {
	
	public static void main(String[] args) {
		Node2 node1 = new Node2("node1");
		Node2 node2 = new Node2("node2");
		Node2 node3 = new Node2("node3");
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node1;
		
		node3.previous = node2;
		node2.previous = node1;
		node1.previous = node3;
		
		//插入一个node4，插入到node1和node2之间
		Node2 node4 = new Node2("node4");
		node1.next = node4;
		node4.next = node2;
		
		node2.previous = node4;
		node4.previous = node1;
		
		//删除node4
		node1.next = node2;
		node2.previous = node1;
		node4.next = null;
		node4.previous = null;
	}

}
