package LinkList41;

/**
 * �����Զ��嵥������
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
		
		//������һ��node4���������node1��node2֮��
		Node node4 = new Node("node4");
		
		node1.next = node4;
		node4.next = node2;
		
		System.out.println(node1.next.next.next.data);
		
		//ɾ��node4
		node1.next = node2;
		node4.next = null;//node4Ҳ��Ӧ����ָ��node2
		
		System.out.println(node1.next.next.data);
	}
}
