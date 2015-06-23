package exception72.customexception;

/**
 * �����Զ����쳣
 * 
 * @author hxy
 * 
 */
public class MyExceptionTest {
	public void method(String str) throws MyException, MyException2, Exception {
		if (null == str) {
			throw new MyException("������ַ���str����Ϊnull");
			
		} else if(str.equals("hello")) {
			throw new MyException2("������ַ�������Ϊhello");
		}
		else {
			System.out.println(str);
		}
	}
	
	/**
	 * ��main�������׳��쳣������JVM������
	 * @param args
	 */
	public static void main(String[] args) {
		MyExceptionTest test = new MyExceptionTest();
		
		String str = "hello";
		
		//����������catch�飬���Ƕ���ֻ��һ������Խ��롣
		try {
			test.method(str);
		} catch (MyException e) {
			System.out.println("����MyExcetpion��");
			e.printStackTrace();
		} catch (MyException2 e) {
			System.out.println("����MyExcetpion2��");
			e.printStackTrace();
		} catch (Exception e) {//Exceptionֻ�ܷ������λ�ã������������������޷���ȡ����
			System.out.println("����Exception��");
			e.printStackTrace();
		}finally{
			System.out.println("finally...�쳣�������");
		}

		System.out.println("try...catch...finally�����ִ�����");
	}
}
