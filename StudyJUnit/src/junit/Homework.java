package junit;

public class Homework {
	public int getLargest(int[] array) throws Exception{
		if(array == null){
			throw new Exception("���鲻��Ϊ��");
		}
		
		if(array.length == 0){
			throw new Exception("���鳤�Ȳ���Ϊ0");
		}
		
		int largest = 0;
		
		for(int element : array){
			if(element > largest){
				largest = element;
			}
		}
		
		return largest;
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5};
		Homework homework = new Homework();
		try {
			int largest = homework.getLargest(array);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
