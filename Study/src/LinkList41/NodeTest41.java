package LinkList41;

/**
 * 测试自定义单向链表
 * @author hxy
 *
 */
public class NodeTest41 {
	public static void main(String[] args) {
		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");
		
		node1.next = node2;
		node2.next = node3;
		
		System.out.println(node1.next.next.data);
		
		//新生成一个node4并把其插入node1和node2之间
		Node node4 = new Node("node4");
		
		node1.next = node4;
		node4.next = node2;
		
		System.out.println(node1.next.next.next.data);
		
		//删除node4
		node1.next = node2;
		node4.next = null;//node4也不应该再指向node2
		
		System.out.println(node1.next.next.data);
	}
}
