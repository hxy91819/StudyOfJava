package LinkList41;
/**
 * ����һ��˫��ѭ������
 * LinkedList�ײ��ʵ�ַ�����
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
		
		//����һ��node4�����뵽node1��node2֮��
		Node2 node4 = new Node2("node4");
		node1.next = node4;
		node4.next = node2;
		
		node2.previous = node4;
		node4.previous = node1;
		
		//ɾ��node4
		node1.next = node2;
		node2.previous = node1;
		node4.next = null;
		node4.previous = null;
	}

}
