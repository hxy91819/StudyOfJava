package IDE38;

public class Test {

	public boolean canAccess(int access){
		if(access == Authorization.MANAGER){
			return true;//�������
		}
		if(access == Authorization.DEPARTMENT){
			return false;//���ž������Ȩ��
		}
		if(access == Authorization.EMPLOYEE){
			return false;//��ͨԱ��
		}
		return false;
	}
	public static void main(String[] args) {

	}

}
