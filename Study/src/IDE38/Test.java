package IDE38;

public class Test {

	public boolean canAccess(int access){
		if(access == Authorization.MANAGER){
			return true;//经理访问
		}
		if(access == Authorization.DEPARTMENT){
			return false;//部门经理访问权限
		}
		if(access == Authorization.EMPLOYEE){
			return false;//普通员工
		}
		return false;
	}
	public static void main(String[] args) {

	}

}
