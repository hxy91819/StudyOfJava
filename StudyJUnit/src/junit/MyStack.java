package junit;

/**
 * �Զ���ջ��Ҫ����ɵ�Ԫ����
 * @author hxy
 *
 */
public class MyStack {
	private String[] elements;
	
	private int nextIndex;
	
	public MyStack(){
		elements = new String[100];
		nextIndex = 0;
	}
	
	public void push(String element) throws Exception{
		if(100 == nextIndex){
			throw new Exception("����Խ���쳣");
		}
		
		elements[nextIndex++] = element;
	}
	
	public String pop() throws Exception{
		if(0 == nextIndex){
			throw new Exception("����Խ���쳣");
		}
		
		return elements[--nextIndex];
	}
	
	public void delete(int n) throws Exception{
		if(nextIndex - n < 0){
			throw new Exception("����Խ���쳣");
		}
		
		nextIndex = nextIndex - n;
	}
	
	public String top() throws Exception{
		if(0 == nextIndex){
			throw new Exception("����Խ���쳣");
		}
		
		return elements[nextIndex - 1];
	}
}