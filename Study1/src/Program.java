
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB bb = new BB();//∂‡Ã¨÷Æ“ª
		AA aa = bb; 
		aa.output();
		
		AA aa2 = new BB();
		BB bb2 = (BB)aa;
		bb2.output();
	}
	public Program(){
		
	}
}

interface AA
{
	public void output();
}
class BB implements AA
{
	public void output(){
		System.out.println("BB");
	}
}